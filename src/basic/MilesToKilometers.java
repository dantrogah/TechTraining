package basic;

import java.util.Scanner;

public class MilesToKilometers {

	public static void main(String[] args) {
		
		int userChoice = 0;
		
		do {
			// ask user for input
			System.out.print("Enter value in miles: ");
			Scanner input = new Scanner(System.in);
			double miles = input.nextDouble();
			
			// convert to kilometers
			double kilometers = miles * 1.62;
			
			// print result in kilometers
			System.out.printf("The distance in kilometers in %.2f", kilometers);
			
			
			// prompt user 
			System.out.println("\nDo you want to convert another value (1-Yes / 0-No)");
			userChoice = input.nextInt();
			
		}
		while(userChoice != 0);
		
		System.out.println("Thank for using the App");
	}

}
