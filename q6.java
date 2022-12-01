package question6;

import java.util.Scanner;

public class q6 {
	// static veriables for future flud change
	// distance
	public static final int pace1 =3;
	public static final int pace2 = 5;
	public static final int pace3 = 8;
	public static final int pace4 = 10;
	// weeks
	public static final int	weeksI = 2, weeksII = 4,weeksIII = 5;
	public static void main(String[] args) {
		// variables
			int pulseAtRest;
			Scanner input = new Scanner (System.in);
			
			System.out.println("what is your avarage pulse at rest?");
			pulseAtRest = input.nextInt();
		
			// creating table for running
			if (pulseAtRest<= 60)
			{
				System.out.println("for the first "+weeksI +" weeks, we reccomend that you run " + pace1 + " kilometers a day");
				System.out.println ("until week " + weeksII + " we reccomend that you run " + pace2 + " kilometers a day");
				System.out.println("for the" + weeksIII + "th week and after, we reccomend that you run " + pace4 + " kilometers a day");
			}
			
			else if (pulseAtRest <=70 && pulseAtRest > 60)
			{
				System.out.println("for the first "+weeksI +" weeks, we reccomend that you run " + pace1 + " kilometers a day");
				System.out.println ("until week " + weeksII + " we reccomend that you run " + pace2 + " kilometers a day");
				System.out.println("for the" + weeksIII + "th week and after, we reccomend that you run " + pace3 + " kilometers a day");
			}
			else if (pulseAtRest> 70)
			{
				System.out.println("we reccomend that you run "+ pace1 + " kilometers a day");
			}
		
	}

}
