package Practice;

public class Months {

	public static void main(String[] args) {
		
		int month = 12;
		if(month == 2)
		{
			System.out.println("Month has 28 days");
		}
		else if(month == 4 || month == 6 || month == 9 || month == 11)
		{
			System.out.println("Month has 30 days");
		}
		else
		{
			System.out.println("Month has 31 days");
		}
	}

}
