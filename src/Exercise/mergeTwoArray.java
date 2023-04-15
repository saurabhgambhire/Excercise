package Exercise;

public class mergeTwoArray {

	public static void main(String[] args) {
		int[] arr1 = {1,3,5,7,9};
		int[] arr2 = {2,4,6,8,10};
		int n1 = arr1.length;
		int n2 = arr2.length;
		
		int[] arr3 = new int[n1+n1];
		
		int i=0,j=0,k=0;
		
//		 transversing two array
		while (i<n1 && i<n2) {
			arr3[k++]=arr1[i++];
			arr3[k++]=arr2[j++];
		}
		
		 // Store remaining elements of first array
        while (i < n1)
            arr3[k++] = arr1[i++];
 
        // Store remaining elements of second array
        while (j < n2)
            arr3[k++] = arr2[j++];
    
		
		
		for (int k2 = 0; k2 < arr3.length; k2++) {
			System.out.print(arr3[k2]+" ");
		}
		
	}

}
