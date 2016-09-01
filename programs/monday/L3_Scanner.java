package monday;
import java.util.Scanner; //tell your translator to come

public class L3_Scanner {
	public static void main(String[] args) {
		Scanner translator = new Scanner(System.in); //Pretend that this is a translator. You need to declare a transator between you and the computer
		
		System.out.println("Enter Some Input: ");
		String input = translator.nextLine();
		System.out.println("You entered " + input);
	}	
}
