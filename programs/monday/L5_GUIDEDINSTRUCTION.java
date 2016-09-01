package monday;
import static java.lang.System.out;
import java.util.Scanner; //tell your translator to come

public class L5_GUIDEDINSTRUCTION {

	public static void main(String[] args) {
		/*
			GROUP INSTRUCTION: TELL STUDENTS WERE CREATING A GRADEBOOK
		*/
				Scanner translator = new Scanner(System.in); //Pretend that this is a translator. You need to declare a transator between you and the computer

				System.out.print("Enter integer score 0..100: ");
				int score =  translator.nextInt();
				
				if (score < 0 || score > 100) { // || is the symbol for OR
					out.println("Score must be between 0 and 100");
				} else if (score >= 90 && score <= 100) {  // && is symbol for AND
					out.println("A");
				} else if (score >= 80 && score < 90) {
					out.println("B+");
				} else if (score >= 70 && score < 80) {
					out.println("B");
				} else if (score >= 60 && score < 70) {
					out.println("C+");
				} else if (score >= 50 && score < 60) {
					out.println("C");
				} else {
					out.println("F");
				}
	}

}
