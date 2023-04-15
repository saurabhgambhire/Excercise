
package Exercise;

import java.util.HashSet;



public class Hashmap {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		HashSet<Integer> h = new HashSet<>();
		HashSet<Integer> h1 = new HashSet<>();
		
		int[] arr = {1,2,3,4,5,1,1,2,3,4,1,8,6,6,7};
		
		for (int i = 0; i < arr.length; i++)
		{
			if (i%2==0) 
			{
				h.add(arr[i]);
			}
			else {
				h1.add(arr[i]);
			}
			
		}
		
		System.out.println(h);
		System.out.println(h1);
		
		
		
		
		

	}

}
