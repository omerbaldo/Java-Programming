package wednesday;
import java.util.Random;

import processing.core.PApplet;
import processing.core.PImage;

@SuppressWarnings("serial")
public class pingPong extends PApplet 
{
	    public static Random random = new Random();
	    
	    //Images for sprites
	    PImage background; //the background image
	    PImage paddleIMAGE; //the paddle image
	    PImage ballImage; //the image of the ball 
	    
	    //Global Variables
	    public Paddle paddle1;
	    public Paddle paddle2;
	    public Ball ball; 
	    public int score;
	    
	    public int paddle1_score;
	    public int paddle2_score;

	    
	    //SETTINGS--------------------------------------------------------------------------------------
	    public void setup() 
	    {
	    	System.out.println();
	    	//sets the sprite images
	        background = loadImage("background.jpg");
	        paddleIMAGE = loadImage("paddle.png");
	        ballImage = loadImage("ball.png");
	 
	        paddle1 = new Paddle(paddleIMAGE, 0, 0); //CREATE NEW PADDLE 
	        paddle2 = new Paddle(paddleIMAGE, 500, 0); //CREATE NEW PADDLE 
	
	        ball = new Ball(ballImage, 0, height / 2);
	    }
	
		public void settings(){
	        size(661, 665);//661 × 665
	    } 
		
	    public void draw() //THIS RUNS MULTIPLE TIMES
	    {
	        paddle1.update();
	        paddle2.update();
	        ball.update();
	 
	        background(background); //MAYBE YOU CAN MAKE STOP MOTION BACKGROUND
	        paddle1.drawPaddle();
	        paddle2.drawPaddle();
	        ball.drawBall();
	    }
	 
		//KEYS PRESSED--------------------------------------------------------------------------
	    public void keyPressed() 
	    {
	    	//paddle1 movement
	        if(key == 'w') 
	        {
	        	paddle1.moveUP = true;
	        }else if (key == 's'){
	        	paddle1.moveDOWN = true; 
	        }
	        //paddle2 movement
	        if (key=='o'){
	        	paddle2.moveUP = true;
	        }else if (key == 'l'){
	        	paddle2.moveDOWN = true;
	        }
	    }
	    public void keyReleased(){
	    	//paddle1 movement
	        if(key == 'w') 
	        {
	        	paddle1.moveUP = false;
	        }else if (key == 's'){
	        	paddle1.moveDOWN = false; 
	        }
	        //paddle2 movement
	        if (key=='o'){
	        	paddle2.moveUP = false;
	        }else if (key == 'l'){
	        	paddle2.moveDOWN = false;
	        }
	    }
	    
	    
	    
	    
	    public class Paddle{
	        PImage sprite;
	        float xPos;
	        float yPos;
	 
	        int speed = 10;
	        public boolean moveUP = false;
	        public boolean moveDOWN = false;
	 
	        public Paddle(PImage paddleSprite, float startX, float startY){
	            sprite = paddleSprite;
	            xPos = startX;
	            yPos = startY;
	        }
	 
	        public void drawPaddle(){
	            image(sprite, xPos, yPos);
	        }
	 
	        public void update()
	        {
	            if(this.moveUP)
	            {
	                this.yPos += this.speed;
	            }
	            if(this.moveDOWN)
	            {
	                this.yPos -= this.speed;
	            }
	 
	            checkBounds();
	        }
	 
	        
	        // the x position of the paddle is the left edge of the image 
	        
	        //check the y position 
	        public void checkBounds()
	        {
	            if(this.yPos < 0) //If x position is less than 0, it is off the left size
	            {
	                this.yPos = 0; //if its off then make it go back to zero 
	                moveDOWN = false; //set this to false so the paddle stops leaving the screen
	            }
	            if(this.yPos + this.sprite.height > height){ //checks the right side
	                this.yPos = height - this.sprite.height; //
	                moveUP = false;
	            }
	        }
	    }
		
	    
	    
	    
	    
	  //SOAP BALL OBJECT
	    public class Ball{
	 
	        PImage sprite; 
	        float xPos;
	        float yPos;
	 
	        int xSpeed = 8;
	        int ySpeed = 8;
	 
	        //CONSTRUCTOR
	        public Ball(PImage ballSprite, float startX, float startY){
	            sprite = ballSprite;
	            xPos = startX;
	            yPos = startY;
	        }
	 
	        public void drawBall(){
	            image(sprite, xPos, yPos);
	        }
	 
	        public void update(){
	            this.xPos += this.xSpeed;
	            this.yPos += this.ySpeed;
	 
	            checkBounds();
	            checkCollision();
	        }
	 
	        
	        //Bounce off of the top and bottom. if it goes left or right add points 
	        
	        public void checkBounds() //checks bottom, top, left , right
	        {
	            if(this.yPos < 0){ //on the bottom
	                this.ySpeed = -this.ySpeed; //makes the speed go in the opposite direction
	            
	            }if(this.xPos < 0) //off the left
	            {
	            	//Reset to middle, add 1 point to paddle 2
	            	
	            	paddle2_score +=1;	            	
	            	
	            	this.xSpeed = -this.xSpeed; //makes the speed go in the opposite direction
	                this.xPos = 0;
	            }
	            if(this.xPos + this.sprite.width > width){ //off the right
	                //Reset to middle, add 1 point to paddle 1
	            	
	            	paddle1_score += 1;
	            	this.xSpeed = -this.xSpeed;
	                this.xPos = width - this.sprite.width;
	            }
	 
	            if(this.yPos > height){ //off the top
	      	            	
	                this.ySpeed = -this.ySpeed;
	            }
	          
	        }
	 
	 
	        public void checkCollision(){
	            if( this.xPos + this.sprite.width > paddle1.xPos && this.xPos < paddle1.xPos + paddle1.sprite.width ){
	                if(this.yPos > paddle1.yPos - paddle1.sprite.height) {
	                    this.ySpeed = -this.ySpeed;
	                    this.yPos = paddle1.yPos - this.sprite.height;
	                }
	            }
	            
	            if( this.xPos + this.sprite.width > paddle2.xPos && this.xPos < paddle2.xPos + paddle2.sprite.width ){
	                if(this.yPos > paddle2.yPos - paddle2.sprite.height) {
	                    this.ySpeed = -this.ySpeed;
	                    this.yPos = paddle2.yPos - this.sprite.height;
	                }
	            }
	            
	            
	            
	            
	            
	            
	            
	            
	            
	        }
	 
	    }
	    
	    
	    
	    
	    
	    
	    
		
		
		
	
	
	
	
	   public static void main(String _args[]) {
	        PApplet.main(new String[] { pingPong.class.getName() });
	    }  
}
