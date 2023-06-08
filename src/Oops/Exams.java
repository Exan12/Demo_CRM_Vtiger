package Oops;

class Subjects    // Business Logic class ---> parent class
{
	public void English()
	{
		System.out.println("English is an Universal Language");
	}
	
	public void Hindi()
	{
		System.out.println("Hindi is an National Language");
	}
}

class Invisgilator extends Subjects  // Business Logic class ---> Child class
{
	public void Sravya()
	{
		System.out.println("Srvaya is invigilator for English Subject");
	}
	
	public void Chandu()
	{
		System.out.println("Chandu is invigilator for Hindi Subject");
	}
}

public class Exams extends Invisgilator {                // User Logic class

	public static void main(String[] args) {
		
		Exams e = new Exams();
		e.Chandu();
		e.English();
		e.Hindi();
		e.Sravya();
		
		System.out.println("Exam Scheduled");
	}
	
}
