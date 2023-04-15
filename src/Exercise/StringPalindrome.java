package Exercise;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Sring = ");
		String s = sc.nextLine();
		
		char[] arr = s.toCharArray();
		String s1 = "";
		
		for (int i = arr.length-1; i >=0; i--) 
		{
			s1 = s1+arr[i];
		}
		
		if (s.equals(s1)) 
		{
			System.out.println("String is palindrome ");
		}
		else {
			System.out.println("String is not palindrome");
		}

	}

}
