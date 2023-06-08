package Strings;

import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String Input = sc.nextLine();
		System.out.println("Input: "+Input);
		String[] words = Input.split(" ");
		System.out.println("Output: "+words.length);
		sc.close();
	}

}
