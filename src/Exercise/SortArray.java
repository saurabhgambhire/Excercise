package Exercise;


public class SortArray
{

	public static void main(String[] args) 
	{
		int[] arr = {1,2,3,-1,0,3};
		int index = 0;
		
		for (int i = 0; i < arr.length; i++) 
		{
			if (arr[i]!=0)
			{
				arr[index++]=arr[i];
				
			}
			
		}

		while (index < arr.length) 
		{
			arr[index++]=0;
		}
		
		for (int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i]+" ");
			
		}
	}

}
