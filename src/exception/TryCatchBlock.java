package exception;

public class TryCatchBlock {

	public static void main(String[] args) {
		int number1 = 2;
		int number2 = 0;


		try {
			double result = number1 / number2 ;
			System.out.println("Result is " + result);
		}
		catch(ArithmeticException e){
			System.out.println("Error: cannot divide by zero\n" + e.toString());

		}
		
		String[] names = {"Dan", "Bob", "Irene", "Joe", "Perfect"};
		
		for(int i=0; i<=names.length; i++){
			
			try {
			System.out.println(names[i]);
			}
			catch(ArrayIndexOutOfBoundsException e){
				System.out.println(e.toString());
			}
		}
		
	}

}
