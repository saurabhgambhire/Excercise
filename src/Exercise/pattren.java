package Exercise;



public class pattren {
	public static void main(String[] args) 
	{
		int n = 1;
		for(int i=1; i<=5; i++)
		{
			if (i%2==0)
			{
				System.out.print("< text >"+" ");
				
			}
			for(int j=5; j>=i; j--)
			{
				if (i%2==0)
				{
					
					n++;
				}
				else {
					System.out.print(n+" ");
					n++;
				}
			}
			System.out.println();			
		}
		
	}

}
