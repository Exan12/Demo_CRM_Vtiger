package ManiPracticeFolder;

public class Methods {
 
	int x = 10;  // Global Variable
	public void mani()
	{
		System.out.println("My name is mani Reddy");
	}

	public static void Mani()
	{
		System.out.println("My name is mani");
	}

	public static void main(String[] args) {

		System.out.println("Kiran");
		
		//  Non static Method 
		Methods m = new Methods();
		m.mani();
		System.out.println(m.x);
		
		System.out.println("Nani is Hero");
		
		System.out.println("Sangeetha");
         
		//  Static Method
		Methods.Mani();
 
		System.out.println("Chandu");
		System.out.println("Sravvya");
		

	}

}
