package Exercise;

import java.util.Iterator;

public class averageOfElementsOfArray {

	public static void main(String[] args) 
	{
		
		int[] arr = {4,3,5,2,1,3};
		int n = arr.length;
		int sum =0;
		for (int i = 0; i < arr.length; i++)
		{
			sum = sum +arr[i];
		}
		
	System.out.println((double)sum/n);

	}

}
