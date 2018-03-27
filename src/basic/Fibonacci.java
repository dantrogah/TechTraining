package basic;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		int userInput = 0;
		Scanner in = new Scanner(System.in);
		
		// Ask user for input
		System.out.print("Enter the number: ");
		userInput = in.nextInt();
		
		if(userInput < 0){
			System.out.println("Number cannot be negative");
		}else{
			// function call
			System.out.println("Fibonacci number of " + userInput + " is " + fib(userInput));
		}
	}
	
	// function definition to find fibonacci number
	static int fib(int n){
		if(n == 0){
			return 0;
		}
		if(n == 1){
			return 1;
		}
		return (fib(n-1)+ fib(n-2));
	}

}
