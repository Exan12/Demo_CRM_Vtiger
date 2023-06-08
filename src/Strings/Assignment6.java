package Strings;

import java.util.Scanner;

public class Assignment6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String Input = sc.nextLine();
		System.out.println("Input: "+Input);
		String[] words = Input.split(" ");
		
		String outputString = "";
		for(int i=0;i<words.length;i++)
		{
			String word = words[i];
			String reverseword = getStringRev(word) ;
			
			if(i != word.length()- 1)
			{
				outputString = outputString+reverseword+" ";
			}
			else
			{
				outputString = outputString+reverseword;
			}
		}
		System.out.println("Output: "+outputString);
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
