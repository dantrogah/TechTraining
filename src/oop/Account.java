package oop;

public class Account implements IIterest{
	
	// instance variable
	private String accountNumber;
	private String ssn;
	private double accountBalance;
	private String name;
	
	// static variable
	private static final String rountingNumber ="054268";
	private static int id = 100;
	
	// constructor
	Account(String ssn, double initDeposit){
		accountBalance = initDeposit;
		this.ssn = ssn;
		id++;
		accountNumber();
	}
	
	private String accountNumber(){
		int random = (int)(Math.random() * 100);
		if(random < 10){ random += 10; }
		accountNumber = id + "" + random + ssn.substring(0, 3);
		System.out.println("Account Number: " + accountNumber);
		return accountNumber;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	// pay bill
	public void payBill(double amount){
		accountBalance -= amount;
		System.out.println("Pay Bill ¢" + amount);
		showBalance();
	}
	
	// deposit
	public void makeDeposit(double amount){
		accountBalance += amount;
		System.out.println("Make Deposit ¢" + amount);
		showBalance();
	}
	
	public void showBalance(){
		System.out.println("Account Balance: ¢" + accountBalance);
	}

	@Override
	public void accrue() {
		accountBalance = accountBalance * (1 + rate/100);
		showBalance();
		
	}
	
	@Override 
	public String toString(){
		return "[Name: + " + name + "\nAccount Number: " + accountNumber + "\nRountingNumber: " + rountingNumber +
				"\nAccount Balance: " + accountBalance + "]"; 
	}
	
}
