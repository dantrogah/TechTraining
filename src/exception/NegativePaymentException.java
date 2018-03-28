package exception;

public class NegativePaymentException extends Exception{
	
	double amount = 0;
	
	NegativePaymentException(double amount){
		this.amount = amount;
	}

	@Override
	public String toString(){
		return "Error: Cannot take negative payment " + amount;
	}
	
}
