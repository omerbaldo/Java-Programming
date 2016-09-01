package tuesday;

public class L2_ForLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   for (int index = 0; index < 5; index++){
	            System.out.println(index);
	        }
		   
		    
		   //Two ways for even 
		   for (int value = 2; value < 13; value = value + 2){
			   
			   	System.out.println(value);
		    }
		   for(int value = 0; value < 13; value++){
			   if(value%2==0){
				   System.out.println("Even");
			   }
		   }
		   
		   
		   
	}

}
