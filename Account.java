public class Account {
	private double balance;
	private int accNo;
	
	//constructor
	public Account(int accNo) {
		this.accNo =accNo;
	}

	public double getBalance() {
		return balance;
	}

	public int getAccNo() {
		return accNo;
	}
	
	//Deposite Operation
	public void deposit(double depositAmount) {
		balance = balance + depositAmount;
	}
	
	//withdraw Operation
	public void withdraw(double withdrawAmount) throws InsufficientBalanceException {
		if(withdrawAmount <= balance) {
			balance = balance - withdrawAmount;
		}else {
			double insufficientBal = withdrawAmount - balance;
			throw new InsufficientBalanceException(insufficientBal);
		}
	}
}
