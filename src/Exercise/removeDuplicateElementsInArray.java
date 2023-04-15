package Exercise;


public class removeDuplicateElementsInArray {

	public static void main(String[] args) 
	{
		int[] arr = {4,3,9,2,4,1,10,89,34};
		int n = arr.length;
		
		for (int i = 0; i < arr.length; i++) 
		{
			if (arr[i]==-1) 
			{
				continue;
			}
			for (int j = i+1; j < arr.length; j++) 
			{
				if (arr[i]==arr[j])
				{
					arr[j]=-1;
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i]>0) 
			{
				System.out.print(arr[i]+" ");
			}
			
		}
		
//		int arr[] = {1,1,2,2,2,3,3};
//        int k = removeDuplicates(arr);
//        System.out.println("The array after removing duplicate elements is ");
//        for (int i = 0; i < k; i++) {
//            System.out.print(arr[i] + " ");
//        }
//		
//	}
//	static int removeDuplicates(int[] arr) {
//        int i = 0;
//        for (int j = 1; j < arr.length; j++) {
//            if (arr[i] != arr[j]) {
//                i++;
//                arr[i] = arr[j];
//            }
//        }
//        return i + 1;
//    }
	

}
}
