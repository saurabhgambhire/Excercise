package Exercise;

public class sumOfElementsInArray {

	public static void main(String[] args) {
		int[] arr ={1, 2, 3, 4, 5};
		int sum = 0;
		for (int i = 0; i < arr.length; i++) 
		{
			sum = sum + arr[i];
		}
	
	  System.out.println(sum);
	  
	  
	  int nn=1;
	  for (int i = 1; i <= 5; i++) 
	  {
		  
		for (int j = 1; j <= i+1; j++) 
		{
			
			if (i%2==0)
			{
				System.out.print("*"+" ");
			}
			else 
			{
				System.out.print(nn+" ");		
			}	
		}
		System.out.println();
		nn++;
		
	  }
		
	}

}
