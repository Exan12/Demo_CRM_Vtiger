package Strings;

import java.util.Scanner;

public class Assignment10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String Input = sc.nextLine();
		System.out.println("Input: "+Input);
		String revString = " ";
		for(int i=Input.length()-1;i>=0;i--)
		{
			revString = revString+Input.charAt(i);
		}
		System.out.println("Output: "+revString);
		sc.close();
	}

}
