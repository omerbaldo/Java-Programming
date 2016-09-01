package monday;
import java.util.Random;

public class L5_ifstatementsandrelationaloperators {
	public static void main(String[] args) {

		
		
		//OPERATORS
		/*
				== equals
				> greater than
				>= greater than or equal
				< less than
				<= less than or equal
				!= not equal
		 */
		
		//LOGIC
		/*
		 * && RUNS IF BOTH ARE TRUE
		 * || RUNS IF ONE IS TRUE
		 * ! RUNS IF IT IS FALSE
		 */
		
		boolean yes = true;
		boolean no = false;
		
		System.out.println("Both YesYes True: " + (yes && yes));
		System.out.println("Both YesNo True:" + (yes && no));
		
		System.out.println("Either YesYes True: " + (yes||yes));
		System.out.println("Either YesNo True: " + (yes||no));
		
		System.out.println("original yes value" + yes);
		System.out.println("inverse yes value" + !yes);
		
		Random dice = new Random();
		int num = dice.nextInt(10);
		//can randomly genrator ints, doubles, boolean
		
		
		if ( ((num >5)&&(num < 10))||(num == 12)) // rerember two == for equal and to put each condition in an ()
		{
			System.out.println("Number is between 6 and 9. Also it can be 12");
		}
		
		//TO TEACH THIS HAND OUT SHEETS WHICH SAY WHETHER OR NOT SOMETHING IS TRUE OR NOT 	
	}
}
