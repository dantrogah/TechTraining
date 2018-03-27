package basic;

import java.util.Scanner;

public class Arithmetic {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int userInput = 0;
		
		do {
			// ask user for first number
			System.out.print("Enter first number: ");
			double firstNumber = input.nextDouble();
			
			// ask user for second number
			System.out.print("Enter second number: ");
			double secondNumber = input.nextDouble();
			
			// find sum of the two numbers
			double sum = firstNumber + secondNumber;
			
			// print sum on the console
			System.out.println("The sum of " + firstNumber + " and " +
			secondNumber + " is " + sum);
			
			System.out.println("Would you like to perform another calculation ?"
					+ "(1 - Yes/ Any key - No)");
			userInput = input.nextInt();
		}
		while(userInput == 1);
		
		System.out.println("Thanks for using the app");
		
	}

}
