package Exercise;

public class NumberOfOccurnceInArray {

	public static void main(String[] args) {
		
		 int arr[] ={10,5,10,15,10,5};
	      int n = arr.length;
	      
	      for (int i = 0; i < n; i++) {
	    	  
	    	  if (arr[i]==-1) {
	    		  continue;
			}
	    	  int count=1;
	    	  for (int j = i+1; j < n; j++)
	    	{
				if (arr[i]==arr[j])
				{
					arr[j]=-1;
					count++;
				}
			}
	    	  
	    	  System.out.println("The element "+arr[i]+"="+count);
			
		}
	}

}
