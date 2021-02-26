package algorithm_main;

import java.util.*;

public class Subsequence {
	
	public static void main(String[] args) {
		int n = 0;
		int m = 0;
		Scanner in = new Scanner(System.in);
		String[] inputStr = in.nextLine().split(" ");
		n = Integer.valueOf(inputStr[0]);
		m = Integer.valueOf(inputStr[1]);
		while(n!=0 && m!=0){
			double result = 0.0;
			for(int i = n; i <= m; i++) {
				result = result + (1/(Math.pow(i,2)));
			}
			System.out.printf("%.5f\n",result);
			inputStr = in.nextLine().split(" ");
			n = Integer.valueOf(inputStr[0]);
			m = Integer.valueOf(inputStr[1]);
		}
	}

}
