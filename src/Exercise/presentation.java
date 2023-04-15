package Exercise;
public class presentation {

	public static void main(String[] args) {
		
//		for (int i = 1; i <=5; i++) 
//		{	int temp= i;
//			for (int j =4; j>=i; j--)
//			{
//				System.out.print("_"+" ");
//			}
//			for (int j = 1; j <=i*2-1; j++) 
//			{
//				System.out.print(temp+" ");
//				if (j<i) {
//					temp++;
//				}
//				else {
//					temp--;
//				}
//			}
//			System.out.println();
//		}
		
		int n=1;
		for (int i = 1; i <=5; i++) 
		{
			for (int j = 1; j <=i+1; j++)
			{
				if (i%2==0) 
				{
					System.out.print("*"+" ");
					
				}
				else {
					System.out.print(n+" ");
				}
				
			}
			if (i%2==0) {
				n++;
			}
			
			System.out.println();
			
		}
		

	}

}
