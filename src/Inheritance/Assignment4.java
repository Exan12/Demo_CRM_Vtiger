package Inheritance;
class Person
{
	String Name = "Kiran";
	public void set()
	{
		System.out.println("Ratna "+Name);
	}

	public void  get()
	{
		System.out.println(Name);
	}
}

class Employees extends Person
{

}
public class Assignment4  {

	public static void main(String[] args) {

		Employees emp = new Employees();
		emp.set();
		emp.get();
	}

}
