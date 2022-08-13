//child class - InsufficientBalanceException and parent class - Exception
public class InsufficientBalanceException extends Exception {
	private double amount;//amount referred to the insufficient balance
	
	public InsufficientBalanceException(double amount) {
		this.amount =amount;
	}
	public double getAmount() {
		return amount;
	}
	
}
