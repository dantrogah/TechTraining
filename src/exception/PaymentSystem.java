package exception;

import java.util.Scanner;

public class PaymentSystem {

	public static void main(String[] args) {
		
		boolean negativePayment = false;
		
		do {
			// Ask user for amount
			System.out.print("Enter amount: ");

			// Get the amount and test the value
			Scanner input = new Scanner(System.in);
			double amount = input.nextDouble();

			// Handle exception appropriately
			try {
				if(amount < 0){
					negativePayment = true;
					throw new NegativePaymentException(amount);
				}else{
					negativePayment = false;
				}
			}catch(NegativePaymentException e){
				System.out.println(e.toString());
			}
			
		}while(negativePayment);
		
		// print confirmation
		System.out.println("Thanks for the payment");
	}

}
