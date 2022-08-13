import java.util.Scanner;

//import Questions.Account;
//import Questions.InsufficientBalanceException;

public class BankDemo {

	public static void main(String[] args) {
		Account account = new Account(123);
		System.out.println("Depositing Rs.10,000");
		account.deposit(10000.00);
		
		try {
			//implement infinite loop for withdraw operation
			continueTransaction(account);
			
		}catch(InsufficientBalanceException e) {
			System.out.println("Sorry, your account remains only Rs. " +e.getAmount());
			e.printStackTrace();
		}finally {
			System.out.println("Do you wish to continue? yes/no");
			Scanner scanner= new Scanner(System.in);
			
			if(scanner.next().equalsIgnoreCase("yes")) {
				
				try {
				System.out.println("Deposit Rs.10,000");
				account.deposit(10000);
				continueTransaction(account);
				}catch (InsufficientBalanceException e) {
					
					e.printStackTrace();
				}
			}else {
				System.out.println("Good Bye..");
			}
		}
	}
	
	public static void continueTransaction(Account account) throws InsufficientBalanceException {
		double amount;
		
		System.out.println("Please enter amount to be withdrawn = ");
		Scanner scanner = new Scanner(System.in);
	
		while(true) {
			amount = scanner.nextDouble();
			System.out.println("Withdrawing Rs. " +amount +"/=");
			
			account.withdraw(amount);
			
			System.out.println("Existing amount = "+ account.getBalance());
			System.out.println("Please enter amount to be withdrawn = ");
			
		}
	}

}
