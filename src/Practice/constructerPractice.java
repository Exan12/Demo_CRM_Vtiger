package Practice;

public class constructerPractice {

	public int i;
	public static void main(String[] args) {
		
		constructerPractice cp = new constructerPractice();
		System.out.println(cp.i);
	}
	
	public constructerPractice()
	{
		i = 25;
		System.out.println("Naveen");
	}
	
	public constructerPractice(int a)
	{
		i=a;
	}
}
