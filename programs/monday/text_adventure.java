package monday;
import java.util.Scanner;


public class text_adventure {
	public static void main(String[] args) {
		  
	   	  
	   	 Scanner userInput = new Scanner(System.in);
	   	  
	   	 System.out.println("Choose a class:\n1 - Warrior\n2 - Thief\n3 - Mage");
	   	  
	   	 int playerClass = userInput.nextInt();
	   	  
	   	 System.out.println("There is a guard here, what do you do?\n1 - Fight him\n2 - Steal his wallet\n3 - Throw a fireball\n4 - Talk the guard into leaving\n5 - Intimidate the guard\n6 - Bond with the guard over your shared disdain for magic");
	   	  
	   	 int playerChoice = userInput.nextInt();
	   	  
	   	 /* new code goes here */
	   	  
	   	 if( playerClass == 1 && playerChoice == 1){
	   		 System.out.println("You use your awesome warrior skills and punch the guard");
	   	 }
	   	 else if( playerClass == 2 && playerChoice == 2){
	   		 System.out.println("You're so sneaky he doesn't notice his wallet is gone for days.");
	   	 }
	   	 else if( playerClass == 3 && playerChoice == 3){
	   		 System.out.println("You throw a very bright and shiny fireball. The guard is slightly on fire.");
	   	 }
	   	 else {
	   		 System.out.println("Your attempt fails and the guard punches you.");
	   	 }
	   	  
	   	  
	   	 userInput.close();
		
		
	}
}
