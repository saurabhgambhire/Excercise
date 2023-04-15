package Exercise;

import java.util.Scanner;

public class Ex1
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of an Array ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		System.out.println("Enter the Elements "+n+" of an Array ");
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i]=sc.nextInt();
		}
		
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = i+1; j < arr.length; j++)
			{
				if (arr[i]==arr[j]) 
				{
					arr[i]=-1;
					arr[j]=-1;
				}
			}
			
		}
		
		System.out.println("The unique elements of an Array are ");
		for (int i = 0; i < arr.length; i++) 
		{
			if (arr[i]>0) 
			{
				System.out.print(arr[i]+" ");
				
			}
		}

	}

}
