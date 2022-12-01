package question3;

import java.util.Scanner;

public class question3 {

	public static void main(String[] args) {
		int choice;
		int money = 0;
		double duration,drive;
		// check paremeters for close friend/ family
		Scanner input = new Scanner(System.in);
		System.out.println("if you are a friend of the groom or bride, press 1");
		System.out.println("if you are a a family member of the groom or bride, press 2, else, press 3");
		
		choice = input.nextInt();
		boolean	flag = true;
		while (flag) 
		{
			switch (choice) 
			{
				case 1:
				{
					money = 500;
					flag = false;
					break;
				}
				case 2:
				{
					money = 1000;
					flag = false;
					break;
				}
				case 3:
				{
					money = 250;
					flag = false;
					break;
				}
				default:
				{
					money = 0;
					System.out.println("if you are a friend of the groom or bride, press 1");
					System.out.println("if you are a a family member of the groom or bride, press 2, else, press 3");
					choice = input.nextInt();
					break;
				}
			}
		}
		
		
		// if (!=family) then check acquaintanceship duration
		if (choice != 2) {
			System.out.println("how many years have you know the groom or bride?");
			duration = input.nextDouble();
			System.out.println("how many hours is your drive to the wedding?");
			drive = input.nextDouble();
			if (duration >3)
				money+= 50;
			
			if (drive > 1.0)
				money -= 50;
		}
			
		System.out.println("based on my calculations, the amount you are reccomanded to pay is: "+ money);
	}

}
