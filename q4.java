package question4;

import java.util.Scanner;

public class q4 {
	public static final int Adult = 5;// adult number of books
	public static final int Child = 3;// child number of books

	public static void main(String[] args) {
		// creating the veriables
		int canHold = 0;
		int bookAmount;
		boolean bookHeld = false;
		boolean isAdult;
		Scanner input = new Scanner(System.in);
		
		System.out.println("are you an adult? if so, write true, if not, write false");
		isAdult = input.nextBoolean();
		// checking how many books the user can loan
		if (isAdult == true) 
			canHold = Adult;
		 else if (isAdult == false)
			canHold = Child;
		// checking amount of loaned books
		System.out.println("how many books are you loaning at the moment?");
		bookAmount = input.nextInt();
		// validating authority to loan
		System.out.println("do you have a book loaned for more than a month in your possesion?");
		bookHeld = input.nextBoolean();
		
		if (bookHeld == true || bookAmount >= canHold)
			System.out.println("you can not loan another book until you return that book");
		else
			System.out.println("you can loan " + (canHold - bookAmount) + " books");
	}
}
