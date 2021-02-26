package algorithm_main;

import java.util.Scanner;

public class DecimalTest {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] inputStr = in.nextLine().split(" ");
		int[] inputInt = new int[3];
		for(int i = 0;i < 3;i++) {
			inputInt[i] = Integer.valueOf(inputStr[i]);
		}
		double a = (double)inputInt[0];
		double b = (double)inputInt[1];
		double result = a/b;
		System.out.printf("%."+inputInt[2]+"f", result);
		//并未实现多组数字输入。
	}

}
