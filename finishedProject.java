import java.util.Scanner;

public class finishedProject {

	public static void main(String[] args) {
		// setting menu
		Scanner input = new Scanner(System.in);
		System.out.println("to validate ID press 1");
		System.out.println("to run double swap program press 2");
		System.out.println("to find all divisions wih numarator equal to their"
				+ " first digit and denominator their last, press 3");
		System.out.println("to run swapper press 4");//
		System.out.println("to run an hourglass shape, press 5");
		System.out.println("to run a carpet simulation, press 6");
		int programbutton;
		programbutton = input.nextInt();
		switch (programbutton) {
		case 1:
			// program4
			int id;// id number
			int temp = 0;// temporary int for calculaating digits
			double round; // rounding up the digits
			int result = 0; // result from calculating
			int SecurityPin;
			System.out.println("please enter an ID number");
			id = input.nextInt();
			SecurityPin = id % 10;// saving the pin
			id /= 10;// checking the number itself

			for (int i = 4; i > 0; i--) {
				temp = id % 10;
				id /= 10;
				temp *= 2;
				if (temp > 10) {
					result += temp / 10;
				}
				result += temp % 10;
				result += id % 10;
				id /= 10;

			}
			if (((result % 10 - 10) * (-1)) == SecurityPin || (result % 10 == 0 && result % 10 == SecurityPin))
				System.out.println("your ID is valid");
			else
				System.out.println("your id is invalid");

			break;

		case 2:
			// program5
			int number;
			int result5 = 0;
			int placement = 1;
			System.out.println("enter a number");
			number = input.nextInt();
			while (number > 9) {// swapping pairs of numbers
				result5 += placement * 10 * (number % 10);// swap rightmost number
				number /= 10;// pulling rightmost number
				result5 += placement * (number % 10);// swap leftmost number
				number /= 10;// pulling leftmst number
				placement *= 100;// moving to next set
			}
			System.out.println(result5 + placement * number);

			break;

		case 3:
			// program8
			int counter = 0;// checking number of variants found
			for (int i = 10; i < 100; i++) // set loop to check numerators
			{
				for (int j = 10; j < 100; j++)// loop to check denominators
				{
					double mone = i / 10;
					double newI = i;
					if (i < j && mone / (j % 10) == newI / j) {
						System.out.println(i + "/" + j);
						counter++;
					}
				}
			}
			System.out.println(counter);// checking if recieved all 48 varients
			break;

		case 4:
			// program10
			int devider;
			int index = 10;
			int number10;
			int result10 = 0;
			int placement10 = 1;
			System.out.println("please enter a whole number");
			number10 = input.nextInt();
			System.out.println("please enter a set number to group in");
			devider = input.nextInt();
			for (int i = 1; i < devider; i++) {
				index *= 10;// 10 to the power of devider

			} // i == location
			for (int i = 10; number10 != 0; i *= 10) {// swapping pairs of numbers
				result10 += placement10 * index / i * (number10 % 10);// swap rightmost number
				number10 /= 10;// pulling rightmost number
				if (i == index) {
					placement10 *= index;// moving to next set
					i = 1;
				}
			}
			System.out.println(result10);
			break;

		case 5:
			// program13- hourglass
			int triBase;
			System.out.println(" please enter an odd number");
			triBase = input.nextInt();
			// generate loop to form top of hourglass
			for (int i = triBase; i > 0; i--) {
				for (int l = 0; l < triBase - i; l++) {
					System.out.print(" ");
				}
				for (int j = 0; j < i; j++) {
					System.out.print("* ");// rows of stars
				}
				System.out.println("");
			}

			// generate loop to form bottom of hourglass
			for (int i = 0; i < triBase; i++) {
				for (int l = 0; l < triBase - i - 1; l++) {
					System.out.print(" ");
				}
				for (int j = 0; j <= i; j++) {
					System.out.print("* ");// rows of stars
				}
				System.out.println("");
			}
			break;

		case 6:
			// program14- carpet
			System.out.println("enter a number");
			int stars = input.nextInt();
			for (int b = 0; b < stars; b++) {
				for (int a = 0; a < stars; a++) {// rows of carpet
					// generate loop for number of stars per square line
					for (int i = 0; i < stars; i++) {
						for (int j = 0; j < stars; j++) {
							System.out.print("*");// rows of stars
						}
						System.out.print(" ");
					}
					System.out.println("");
				}
				System.out.println(" ");// generate loop for number of stars per square column

			}
			break;

		}
	}

}
