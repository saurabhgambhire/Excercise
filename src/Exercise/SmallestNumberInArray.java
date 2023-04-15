package Exercise;

import java.util.Arrays;

public class SmallestNumberInArray {

	public static void main(String[] args) 
	{
		int[] arr = {3,4,2,5,6,1};
		int min = arr[0];
	    for (int i = 0; i < arr.length; i++) {
	      if (arr[i] < min) {
	        min = arr[i];
	      }
	    }
		System.out.println("The smallest element of An array is "+min);
		
		Arrays.sort(arr);
//		System.out.println("The Smallest Number in Array "+arr[arr.length-1]);
//		
		

	}

}
