package Inheritance;

class Shape
{
	public void Area()
	{
		int l=5,b=6,area;
		area = l*b;
		System.out.println("Area of Rectangle: "+area);
	}
}

class Rectangle extends Shape
{
	
}
public class Assignment1  {

	public static void main(String[] args) {
		
		Rectangle r = new Rectangle();
		r.Area();
	}

}
