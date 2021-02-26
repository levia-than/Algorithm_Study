package algorithm_main;

import java.util.*;


public class Triangle {
	public final static String S = "#";
	public static void main(String[] args) {
		HashMap<Integer,String> triangle = new HashMap<>();
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		for(int i = 0; i < number;i++) {
			String temp = "";
			for(int j = 0; j < 2*i+1;j++) {
				temp += S;
			}
			triangle.put(i, temp);
		}
		for(int i = number-1;i >= 0;i--) {
			System.out.println(triangle.get(i));
		}
	}

}
