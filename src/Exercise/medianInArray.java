package Exercise;

public class medianInArray {

	public static void main(String[] args) 
	{
		int[] arr = {1,2,3,3,4,5};
		int n = arr.length;
		getMedian(arr, n);

	}
	
	public static void getMedian(int[] arr, int n)
	{
		if (n%2==0)
		{
			int n1 = n/2;
			int n2 = n/2-1;
			System.out.println(arr[n2]+arr[n1]/2);
		}
		else {
			System.out.println(arr[n/2]);
		}
	}

}
