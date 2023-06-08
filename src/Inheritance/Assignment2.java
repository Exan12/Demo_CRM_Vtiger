package Inheritance;

class Vehichle
{
	public void speed()
	{
		int T=5,D=6,speed;
		speed = T*D;
		System.out.println("Speed of Car: "+speed);
	}
}

class Car extends Vehichle
{
	
}
public class Assignment2  {

	public static void main(String[] args) {
		
		Car c = new Car();
		c.speed();
	
	}

}
