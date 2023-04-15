package Exercise;

import java.util.Scanner;

public class Hotel 
{
	static Scanner sc = new Scanner(System.in);
	static int[] tables = {1,2,3,4,5};
	public static void main(String[] args) 
	{
		while (true)
		{
			System.out.println("Enter 1 for book table ");
			System.out.println("enter 2 for exit");
			int n = sc.nextInt();
			switch (n) {
			case 1: {
				
				bookTable(tables);
				break;
			}
			case 2: {
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + n);
			}
		}
	}
	
	
	public static void bookTable(int[] tables) 
	{
		System.out.println("Choose your table No  ");
		for (int i = 0; i < tables.length; i++) 
		{
			if (tables[i]>0)
			{
				System.out.print(tables[i]+" ");
			}
		}
		
		int n = sc.nextInt();
		for (int i = 0; i < tables.length; i++) 
		{
			if (n==tables[i])
			{
				System.out.println("Table is booked "+n);
				tables[i]=-n;
			}
			
		}
		
	}

}
