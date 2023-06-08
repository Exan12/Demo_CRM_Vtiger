package ManiPracticeFolder;

/**
 * This class is used to perform Bank opertations
 * @author Kiran
 *
 */
public class BankApplication {


	static int currentBalance = 10000;
	/**
	 * This method is used to greet the customer
	 */
	public void greetCustomer()
	{
		System.out.println("Hi,Welcome to HDFC Bank");
	}
	
	/**
	 * This method is used to get the balance in the Account
	 */
	public void getBalance()
	{
		System.out.println("Balance in the Account: "+currentBalance);
	}
	
	/**
	 * This Method is used to deposit the Amount in the bank
	 * @param amount
	 */
	public static void deposit(int amount)
	{
		currentBalance = currentBalance + amount;
		System.out.println(amount+"/-  Deposited into Account Succesfully");
	}
	
	/**
	 * This Method is used to withdrawl the amount from the Account
	 */
	public boolean withDrawl(int amount)
	{
		if(amount <=0 || amount > currentBalance)
		{
			return false;
		}
		
		currentBalance = currentBalance - amount;
		return true;
	}

	public static void main(String[] args) {
		
		BankApplication ba = new BankApplication();
		ba.greetCustomer();
		deposit(1000);
		ba.getBalance();
		if(ba.withDrawl(12000))
		{
			System.out.println("Amount Withdrawled from account Succesfully");
			ba.getBalance();
		}
		else
		{
			System.out.println("Insufficient Balance in Account");
		}
	}

}
