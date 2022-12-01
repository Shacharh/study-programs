package question5;

import java.util.Scanner;

public class q5 {
	//creating ultimate veriables for fluid changes if Necessary
	public static final int matri = 102;
	public static final int psychometric = 700;
	public static final int mathPsy = 145;
	public static final int englishPsy = 120;
	public static final int avarage = 600;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// creating variables
		int bagrut;
		int psycho;
		int mathmetric;
		int englishmetruc;
		int mem = 0;
		boolean viability = false;
		Scanner input = new Scanner(System.in);
		// checking viability
		System.out.println("please enter your Bagrut exam Avarege");
		bagrut = input.nextInt();
		System.out.println("please enter your full psychometric score");
		psycho = input.nextInt();
		System.out.println("please enter your mathematical psychometric score");
		mathmetric = input.nextInt();
		System.out.println("please enter your english psychometric score");
		englishmetruc = input.nextInt();
		mem = (int) ((psycho * 0.8 + bagrut / 1.2));
		if (bagrut >= matri)

			viability = true;
	
		if (psycho >= psychometric && mathmetric >= mathPsy && englishmetruc >= englishPsy)
			viability = true;
		
		
		if (mem >= avarage)
				viability = true;
	
		// end resault

		if (viability == true)
			System.out.println("we are glad to welcome you into Lilyput Academy");

		else

			System.out.println("we're sorry to inform you that you did not meet our requirements");

	}

}
