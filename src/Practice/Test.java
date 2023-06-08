package Practice;

public class Test {

	int i,j;
	public Test() {
		i = 30;
		j = 50;
	}
	
    public Test(int i,int j) {
		
    	this.i = i;
    	this.j = j;
	}

	public static void main(String[] args) {
		
		Test t1 = new Test();
		Test t2 = new Test(50,50);
		Test t3 = new Test(50,70);
		System.out.println(t1.add());
		System.out.println(t2.add());
		System.out.println(t3.add());
		
		System.out.println(t2.i);
		System.out.println(t2.j);
		
		System.out.println(t1 == t2);
		System.out.println(t2 == t3);

	}
	
	public int add()
	{
		return i+j;
	}

}
