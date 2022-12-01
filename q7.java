package question7;

import java.util.Scanner;

public class q7 {
	 public static final int pass = 55;
	public static void main(String[] args) {
		// generating veriables
		int testscore;
		int homeworkscore;//
		int homeworksub;//
		int finalScore = 0;
		int shield;

		Scanner input = new Scanner(System.in);
		System.out.println("what did you score in the exam?");
		testscore = input.nextInt();
		while (testscore > 100 || testscore < 0)// limit check 0-100
		{
			testscore = 0;
			System.out.println("that is an Invalid input. please enter again");
			testscore = input.nextInt();
		}
		System.out.println("what was your score avarage for you homework?");
		homeworkscore = input.nextInt();
		while (homeworkscore > 100 || homeworkscore < 0)// limit check 0-100
		{
			homeworkscore = 0;
			System.out.println("that is an Invalid input. please enter again");
			homeworkscore = input.nextInt();
		}
		System.out.println("how many homework projects did you submit?");
		homeworksub = input.nextInt();
		while (homeworksub > 8 || homeworksub < 0)// limit check 0-100
		{
			homeworksub = 0;
			System.out.println("there seems to be an error, please enter again");
			homeworksub = input.nextInt();
		}
		// checking values according to requirements
		if (homeworksub <= 4) {
			System.out.println("your final score is 0, since you didnt submit your projects properly");
			if (homeworksub > 4 || homeworksub >= 6) {//barely adequate submmisions
				if (testscore <= 54)
					finalScore = testscore;
				else
					finalScore = (homeworkscore * (20 / 100) + testscore * (80 / 100));
			}
		}
		if (homeworksub == 7 || homeworksub == 8) {// proper submissions
			if (testscore <= 54) {// score lower than 54
				if (homeworkscore >= 80) {
					shield = (homeworkscore * (25 / 100) + testscore *(75 / 100));
					if (shield >= testscore)
						finalScore = shield;
					else finalScore = testscore;
				}
				if (homeworkscore < 80) {
					shield = (homeworkscore * (20 / 100) + testscore *(80 / 100));
					if (shield >= testscore)
						finalScore = shield;
					else finalScore = testscore;
				}
			}
			if (testscore >= 55) {
				shield = homeworkscore * (30 / 100) + testscore * (70 / 100);
					if (shield >= testscore)
						finalScore = shield;
					else finalScore = testscore;
				}
			
		}
		System.out.println("your score is "+ finalScore);
		
		
	}

}
