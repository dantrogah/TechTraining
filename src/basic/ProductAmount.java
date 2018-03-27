package basic;

import java.util.Scanner;

public class ProductAmount {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String answer = "";
		
		do {
			// ask user for price
			System.out.print("Enter the Price: ");
			double price = input.nextDouble();

			// ask user for quantity
			System.out.print("Enter the quantity bought: ");
			int quantityBought = input.nextInt();

			// compute the total amount
			double amount = price * quantityBought;

			// print amount
			System.out.printf("Total Amount is ¢%.2f\n", amount);

			// prompt the user for decision to perform another transaction or otherwise.
			System.out.println("Do you want to calculate another total? Yes or No");
			answer = input.next();
			
		}while(answer.equalsIgnoreCase("yes"));
		
		System.out.println("Thanks for shopping with us");
	}

}
