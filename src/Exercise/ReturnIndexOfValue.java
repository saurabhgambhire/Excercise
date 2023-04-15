package Exercise;



public class ReturnIndexOfValue {

	public static void main(String[] args) 
	{
		int[] arr = {1,2,3,4,5,6,7};
		
		int n = 7;
		
		System.out.println(returnIndexOfValue(arr, n));
	}

	private static int returnIndexOfValue(int[] arr, int n) 
	{
		int i;
		for ( i = 0; i < arr.length; i++) 
		{
			if (arr[i]== n) {
				return i;
			}
		}
		
//		return i;
		return 0;
		
	}

}
