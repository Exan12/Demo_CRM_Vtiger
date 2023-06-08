package Inheritance;
class Bank
{
	static int CurrentBalance = 0;
	public void deposit(int amount)
	{
		CurrentBalance = CurrentBalance + amount;
		System.out.println(CurrentBalance+" Added to account Succesfully");
	}
	
	public void withdrwal(int amount)
	{
		CurrentBalance = CurrentBalance - amount;
		System.out.println(CurrentBalance+" Withdrawled from account Succesfully");
	}
}

class Savingaccount extends Bank
{
	
}
public class Assignment3  {

	public static void main(String[] args) {
		
		Savingaccount sa = new Savingaccount();
		sa.deposit(1000);
		sa.withdrwal(500);
	}

}
