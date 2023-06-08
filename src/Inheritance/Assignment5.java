package Inheritance;
class Animal
{
	String Name = "Nicy";
	public void set()
	{
		System.out.println("The cat name was: "+Name);
	}

	public void  get()
	{
		System.out.println(Name);
	}
}

class Cat extends Animal
{
    public void Meow()
    {
    	System.out.println("The cat barks Meow...Meow...Meow");
    }
}
public class Assignment5 extends Cat {

	public static void main(String[] args) {

		Assignment5 a5 = new Assignment5();
		a5.get();
		a5.set();
		a5.Meow();
	}

}
