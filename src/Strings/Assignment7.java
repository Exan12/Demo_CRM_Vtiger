package Strings;

import java.util.Scanner;

public class Assignment7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String Input = sc.nextLine();
		System.out.println("Input: "+Input);
		String[] words = Input.split(" ");
		
		String OutputString = "";
		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			if(i%2==0)
			{
				OutputString = OutputString+word.toUpperCase();
			}
			else
			{
				OutputString = OutputString+getStringRev(word);	
			}
			
			if(i != word.length()- 1)
				OutputString = OutputString+" ";
		}
		
		System.out.println("Output: "+OutputString);
		sc.close();
	}
	
     private static String getStringRev(String InputString) {
   
		String revString = "";
		for (int j = InputString.length()-1;j>=0;j--)
		{
			 revString = revString+InputString.charAt(j);
		}
		return revString;
     }
}
