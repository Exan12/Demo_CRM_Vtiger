package MethodsPack;

public class BankApplication {
	
	int currentBalance = 1000;
	
	/**
	 * This Method is used to greet the customer in the Bank
	 */
	public void greetToCustomer()
	{
		System.out.println("Hello, Welcome to HDFC Bank ");
	}
	
	/**
	 * Ths Method is used to Tell the Current Balance in the Account
	 * @return
	 */
	public int getCurrentBalance()
	{
		return currentBalance;
	}
	
	/**
	 * This Method is used to Deposit Amount into the Bank
	 * @param amount
	 */
	public void deposit(int amount)
	{
		currentBalance = currentBalance + amount;
		System.out.println(amount+" Amount Added in to the Application Succesfully");
	}
	
	/**
	 * This Method is used to Withdrawl Amount from the Account
	 * @param amount
	 * @return 
	 */
	public boolean withDrawl(int amount)
	{
		
		if(amount <= 0 || amount > currentBalance )
		{
			return false;
		}
		
		// update current balance
		currentBalance = currentBalance - amount;
		return true;
	}
	
	public static void main(String[] args) {
		
		BankApplication ba = new BankApplication();
		ba.greetToCustomer();
		System.out.println("Current Balance in the Account : "+ba.getCurrentBalance());
		ba.deposit(10000);
		System.out.println("Current Balance in the Account : "+ba.getCurrentBalance());
		if(ba.withDrawl(12000))
		{
			System.out.println("Amount Withdrawled from Account Succesfully");
			System.out.println("Current Balance in the Account : "+ba.getCurrentBalance());
		}
		else
		{
			System.out.println("Insufficient Balance in the Account");
		}
	}
}
