package Practice;

import java.util.Scanner;

public class Payments {

	/**
	 * Payment by Debit Card
	 */
	public void payment()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the card number");
		String cardnumber = sc.next();
		System.out.println(cardnumber);
		System.out.println("Enter the Year ");
		int year = sc.nextInt();
		System.out.println(year);
		System.out.println("Enter the Month ");
		int month = sc.nextInt();
		System.out.println(month);
		System.out.println("Enter the cvv number");
		int cvv = sc.nextInt();
		System.out.println(cvv);
		System.out.println("Payment done Succesfully");
		sc.close();
	}
	
	
	public static void payment(String cardnumber,String year,String month,String cvv)
	{
		System.out.println(cardnumber);
		System.out.println(year);
		System.out.println(month);
		System.out.println(cvv);
	}
	public static void main(String[] args)
	{
		Payments.payment("4578 994 7895 6741","2023","12","753");
		Payments p = new Payments();  // ---> TO Initialize Non static memmbers
		p.payment();
	}

}
