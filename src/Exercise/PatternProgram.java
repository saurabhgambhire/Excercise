package Exercise;



public class PatternProgram {

	public static void main(String[] args)
	{
		
	for(int i =0; i<5 ; i++)
	{
		for(int j = 0; j<5 ; j++)
		{
			if ((i==2 || j == 2) || (i==0&&j==0) || (i==1&&j==0))
			{
				System.out.print("*"+" ");
			}
			else {
				System.out.print(" "+" ");
			}
		}
		System.out.println();
		
	}
		

	}

}
