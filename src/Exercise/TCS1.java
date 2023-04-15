package Exercise;

import java.util.Scanner;

public class TCS1
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // total number of places
        int K = sc.nextInt(); // number of parks to be developed
        
        int numArrangements = 0;
        
        // If the number of parks to be developed is 1, then there is only one possible arrangement
        if (K == 1) {
            numArrangements = N;
        }
        // If the number of parks to be developed is greater than 1
        else {
            // We need to distribute (K - 1) gaps between the parks
            // There are (N - K + 1) possible places to start the first park
            // We can use combinations to find the number of ways to choose (K - 1) gaps from (N - 1) possible gaps
            numArrangements = combinations(N, K);
        }
        
        System.out.println("Number of arrangements: " + numArrangements);
		  
	}
	
	  // Function to calculate the number of combinations
    public static int combinations(int n, int k) {
        int numerator = 1;
        int denominator = 1;
        for (int i = n; i > n - k; i--) {
            numerator *= i;
        }
        for (int i = 1; i <= k; i++) {
            denominator *= i;
        }
        return numerator / denominator;
}

}
