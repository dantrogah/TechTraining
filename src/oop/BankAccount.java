package oop;

public class BankAccount {

	public static void main(String[] args) {
		// Loan account object and its usage
		LoanAccount la = new LoanAccount();
		la.increaseRate();
		la.setRate();
		la.setTerm(10);
		la.setAmortSchedule();
		System.out.println("------------------");
		
		// Polymorphism - the reference is pointing to a different object. 
		IRate ir = new LoanAccount();
		ir.increaseRate();
		ir.setRate();
		System.out.println("------------------");
		
		// Account class objects
		Account acc = new Account("124563478", 1000);
		Account acc2 = new Account("245678934", 2500.80);
		Account acc3 = new Account("314212212", 1500.50);
		
		acc.setName("Daniel");
		System.out.println(acc.getName());
		acc.payBill(600);
		acc.makeDeposit(2000);
		acc.accrue();
		System.out.println(acc.toString());
		
		

	}

}
