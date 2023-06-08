package Practice;

import java.util.Scanner;

public class weekDays {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the Week");
		String Name = sc.next();
		if (Name.equals("Saturday") || Name.equals("Sunday"))
		{
			System.out.println("It's a Weekend");
		}
		else
		{
			System.out.println("It's a Weekday");
		}
	}

}
