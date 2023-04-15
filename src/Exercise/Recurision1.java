package Exercise;


public class Recurision1 {

	public static void main(String[] args)
	{
		int num = 5;
		System.out.println(printNum(num));
	}

	private static int printNum(int num)
	{
		if (num == 1)  return 1;
		 return printNum(num-1);
	
	}
	
	

}
