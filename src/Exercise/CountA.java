package Exercise;

import java.util.Scanner;



public class CountA
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your String = ");
		String s = sc.next();
		System.out.println("Enter max length of char = ");
		int n = sc.nextInt();
		
		System.out.println(count(s,n));
		
	}

	public static int count(String s, int n) 
	{
		int length = s.length();
		if (n % length == 0) 
		{
			return n/length;
		}
		else {
			return n/length+1;
		}
	}
	
	
}
