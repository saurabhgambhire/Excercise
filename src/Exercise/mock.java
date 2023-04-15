package Exercise;

import java.util.ArrayList;
import java.util.HashSet;

public class mock {

	public static void main(String[] args) 
	{
//		int n= 123;
//		String ans = "";
//		while(n>0)
//		{
//			String s ="";
//			int rem = n%10;
//			s= s+ rem;
//			ans = s + ans;			
//			n/=10;
//		}
//		
//		System.out.println(ans);
		
		
		String s = "saurabh";
		ArrayList<Character> list = new ArrayList<>();
		for (int i = 0; i < s.length(); i++) 
		{
			list.add(s.charAt(i));
		}
		
		System.out.println(list);
		
		HashSet<Character> ss = new HashSet<>(list);
		System.out.println(ss);

	}

}
