package Exercise;

import java.util.Arrays;

public class RotateElement {

	public static void main(String[] args)
	{
		int[] arr = {1,2,3,4,5};
		int k=2;
		int n = arr.length;
//		System.out.println(arr[n-1]);
				
		rotate(arr, n-k , n-1);
		printArray(arr);
		
		rotate(arr, 0, n-k-1);
		printArray(arr);
		
		rotate1(arr, 0, n-1);
		printArray(arr);
	}
	
	
	public static void rotate(int[] arr, int i, int j) 
	{
		while (arr[i]<arr[j])
		{
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			
//			i++;
//			j--;
		}
		
	}
	public static void rotate1(int[] arr, int i, int j) 
	{
		while (arr[i]<arr[j])
		{
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			
			i++;
			j--;
		}
		
	}
	
	public static void printArray(int[] arr) 
	{
		for (int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i]+" ");
			
		}
		System.out.println();
		
	}
}
