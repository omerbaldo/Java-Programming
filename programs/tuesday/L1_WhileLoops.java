package tuesday;
import java.util.Random;

public class L1_WhileLoops {

	public static void main(String[] args) {
        
		//activity one
		
		int i = 0;
		int classSize = 8;
		while(i<classSize){
		    if (i%2 == 0){
		    	System.out.println("Even");
		    }else{
		    	System.out.println("odd");
		    }
		    i++;
		}
		//activity two
		i = 0;
		while(i<classSize){
		    if (i%2 == 0){
		    	System.out.println("multiple of 2");
		    }
		    i++;
		}
		//activity three 
		
		
		
		
		Random numberGenerator = new Random();
        
        
        System.out.println("Welcome to the endless tower!");
 
 
        // Set up starting values
        int playerHealth = 100;
        int enemyHealth = 10;
         
        int playerAttack = 1;
        int enemyAttack = 1;
 
        int damage;
        int enemiesDefeated = 0;
         
        while(playerHealth > 0){
 
            // Fight opponent if they are alive
            if(enemyHealth > 0){
 
                System.out.println("Your HP: "+ playerHealth + " Enemy HP: " + enemyHealth);
                 
                // Player attack
                damage = playerAttack + numberGenerator.nextInt(3);
                System.out.println("You attack the enemy for " + damage + " damage.");
                enemyHealth -= damage;
   
                 
            }
            else {
                enemiesDefeated++;
                break;
  
 
            }
             
        }
         
        System.out.println("You defeated " + enemiesDefeated + " enemies.");
 
	}
	
	
	
}
