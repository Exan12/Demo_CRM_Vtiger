package Inheritance;

public class Admin extends Developer {
	
	public void manage()
	{
		System.out.println("Managing Data");
	}
	
	public void read()
	{
		System.out.println("Reading Data");
		super.read();
	}
	
	public void write()
	{
		System.out.println("Writing Data");
		super.write();
		
	}
}
