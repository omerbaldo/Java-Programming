package monday;

import java.util.Scanner;

public class L5_GUIDEDINSTRUCTIONDayTime {

	public static void main(String[] args) {
		Scanner IO = new Scanner(System.in); //Pretend that this is a translator. You need to declare a transator between you and the computer


		// Checking for sunrise hour
		
		System.out.println("Enter sunrise hour :"); //enters  the time the sun rises 
		int sunriseHour = IO.nextInt();
		
		System.out.println("Enter yes for AM, no for PM"); //so yes is true and no is true
		boolean sunriseIsAM = IO.nextBoolean();

		System.out.println("Enter sunrise minute: ");
		int sunriseMinute = IO.nextInt();
		
		
		//Now checking for sunset
		
		
		System.out.println("Enter sunset hour :");
		int sunsetHour = IO.nextInt();
		
		System.out.println("Enter yes for AM, no for PM"); //so yes is true and no is true
		boolean sunsetIsAM = IO.nextBoolean();
		
		
		System.out.println("Enter sunset minute: ");
		int sunsetMinute = IO.nextInt();
		
		// now using if statements to print out sunrise
		
		if (!sunriseIsAM && sunriseHour < 12)     //! before boolean checks if variable is not true 
												
		{
			//true code: if sunrise is not am (pm) and sunrisehour is less than 12 
			
			sunriseHour += 12; // adds 12 if the sunrise is pm 
		}
		
		
		if (!sunsetIsAM && sunsetHour < 12)     //! before boolean checks if variable is not true 
			
		{
			//true code: if sunset is not am (pm) and sunsethour is less than 12 
			
			sunsetHour += 12; // adds 12 if sunset is pm
		}
		
		int sunriseMinsAfterMidnight = (sunriseHour * 60) + sunriseMinute;
		int sunsetMinsAfterMidnight = (sunsetHour *60) + sunsetMinute;
		
		int daylightMinutes = sunsetMinsAfterMidnight - sunriseMinsAfterMidnight;
		
		int dayHours = daylightMinutes / 60; //integer division, truncates fractional part, gives quotient
		int dayMinutes = daylightMinutes % 60; //remainder
		
		System.out.println("amount of daylight is " + dayHours + " hours and " + dayMinutes + " minutes"); //computes hours of daylight
	}
}

