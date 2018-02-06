// MidtermPractice.java
// Matthew Kunimoto

// Write a static method called giveProblems that takes a console scanner 
// and an integer n as parameters and that makes up n multiplication problems
// for the user to solve.  Each multiplication problem involves choosing two 
// numbers that are each between 1 and 12 inclusive.  The user should be prompted 
// for the answer and should be told whether their answer was correct or incorrect.
// The method should also report the number of problems solved correctly and the
// number of problems given.

import java.util.*;

public class MidtermPractice{
	public static void main(String[] args){
		Scanner console = new Scanner(System.in);
		giveProblems(console, 5);
	}


	public static void giveProblems(Scanner scan, int n){
		Random rand = new Random();

		// integer variables to be used for multiplaction
		int a;
		int b;

		// integer variable to store user's answer
		int userAnswer;

		// integer variable to track number of correct answers
		int correctAnswers = 0;

		for(int i = 0; i < n; i++){
			// randomizing values
			a = rand.nextInt(12) + 1;
			b = rand.nextInt(12) + 1;
	 
			// printing out to tell user the problem
			System.out.print(a + " * " + b + " =? ");
			userAnswer = scan.nextInt();

			// verifying answer and telling user
			if(userAnswer == (a*b)){
				System.out.println("correct");
				correctAnswers++;
			}
			else{
				System.out.println("incorrect...the answer was " + (a*b));
			}

		}
		// reporting statistics
		System.out.println(correctAnswers + " 0f " + n + " correct ");
	}
}