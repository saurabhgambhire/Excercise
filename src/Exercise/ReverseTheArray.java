package Exercise;

public class ReverseTheArray {

	public static void main(String[] args) 
	{
		
//		Approch no 1
		int[] arr = {1,2,3,4,5};
		int n = arr.length;
//		int[] ans = new int[n];
//		for (int i = n-1; i>=0; i--)
//		{
//			ans[n-i-1]=arr[i];
//		}
//		
//		printArray(ans);
		
		
		
	int i=0, j=n-1;
				
				while (arr[i]<arr[j])
				{
					 int temp= arr[i];
					 arr[i]= arr[j];
					 arr[j]=temp;
					 
					 i++;
					 j--;
				}
		 
		printArray(arr);
		
	}
	
	public static void printArray(int[] arr)
	{
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
