package Exercise;

public class RotateElementBykTimes {

	public static void main(String[] args)
	{
		int [] arr = {3,7,8,9,10,11};
		int n = arr.length;
		int k = 3;
		rotateElement(arr, n, k);
		
		for (int i : arr) 
		{
			System.out.print(i+" ");
		}

	}

	private static void rotateElement(int[] arr, int n, int k) 
	{
		reverse(arr, 0, n-k-1);		// reverse first n-k elements
		
		reverse(arr, n-k, n-1);		// reverse last n-k elements
		
		reverse(arr, 0, n-1); 		// reverse all the elements
	}

	private static void reverse(int[] arr, int i, int j) 
	{
		while (i<j) 
		{
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			
			i++;
			j--;
		}
		
	}

}
