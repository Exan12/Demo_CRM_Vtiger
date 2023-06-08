package PatternProgramming;

public class MethodPractice {
	
	//Static Method
	public static void Name()
	{
		System.out.println("Sravya");
	}
	
	// Non-Static Method
	public void name()
	{
		System.out.println("Sravya");
	}
	
	public static void main(String[] args) {
		
		// Accessing the Static Methods
		Name();
		MethodPractice.Name();
		
		// Accessing the Non-Static Methods
		MethodPractice mp = new MethodPractice();
		mp.name();
       	}

}
