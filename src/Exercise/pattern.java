package Exercise;

public class pattern {

	public static void main(String[] args) {
	int n =1;
		for (int i = 1; i <= 5; i++) 
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
			if(i%2==0) 
			{
				n++;
			}
			
			System.out.println();
		}
	}

}
