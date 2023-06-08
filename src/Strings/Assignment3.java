package Strings;

import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String Input = sc.nextLine();
		System.out.println("Enter the target Character");
		char Targchar = sc.next().charAt(0);
		System.out.println("Input: "+Input);
		System.out.println("Target Character: "+Targchar);
		
		char[] character = Input.toCharArray();
		int count = 0;
		for(int i=0;i<character.length;i++)
		{
			if(character[i] == Targchar)
				count++;
		}
		System.out.println("Output: "+count);
		sc.close();
	}

}
