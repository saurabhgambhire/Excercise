package Exercise;

public class Patternd {

	public static void main(String[] args) {
		int n=5;
		int num=1;
		
		for(int i=1;i<=5;i++)
		{
			
			for(int j=1;j<=i+1;j++)
			{
				if (i%2==0) 
				{
					System.out.print("*"+" ");
				}
				else {
					System.out.print(num+" ");
				}
				
				
				
			}
			if (i%2==0)
			{
				num++;
			}
			System.out.println();
		}

	}

}
