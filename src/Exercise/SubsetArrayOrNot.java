package Exercise;



public class SubsetArrayOrNot {

	public static void main(String[] args) 
	{
		int	arr1[]= {1,3,4,5,2};
		int n = arr1.length	;
		int arr2[]= {11,12,13,15,16};
		int m = arr2.length;
		
		if (n<m) 
		{	int i, c=0;
			for ( i = 0; i < arr1.length; i++) 
			{
				for (int j = 0; j < arr2.length; j++) 
				{
					if (arr1[i]== arr2[j])
					{
						c++;
					}
				}
			}
			
			if (i==c) 
			{
				System.out.println("arr1 [] is sub-set of arr2 [] ");
			}
			else {
				System.out.println("arr1 [] is not sub-set of arr2 [] ");
			}
			
		}
		else 
		{
			System.out.println("arr1 [] is not sub-set of arr2[] ");
		}
	}

}
