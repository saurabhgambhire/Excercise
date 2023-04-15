package Exercise;

public class addElementAtStart {

	public static void main(String[] args) {
		
		int n=8;
	    int arr[]={10,9,14,8,20,48,16,9,0};
	    int value=40; 
	    
	    for (int i = n-1; i>=0; i--) 
	    {
			arr[i+1] = arr[i];
		}
	    arr[0]=value; // at start 
	    arr[n]=19;    // at end
	    
	    for (int i : arr) {
			System.out.print(i+" ");
		}

	}

}
