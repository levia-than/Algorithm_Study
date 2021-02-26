/**
 * 
 */
package algorithm_main;

import java.util.Scanner;

/**
 * @author lion messi
 * @version 1.0
 */
public class Hanxin {

	/**
	 * @param args
	 */
	public static int possibleNum = 0;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] inputStr = in.nextLine().split(" ");
		int[] inputInt = new int[3];
		for(int i = 0;i < 3;i++) {
			inputInt[i] = Integer.valueOf(inputStr[i]);
		}
		possibleNum = inputInt[0];
		int i = 0;
		while(possibleNum <= 100) {
			possibleNum = i * 3 + possibleNum;
			if(possibleNum < 10) {
				i += 1;
				continue;
			}
			boolean ifFitFive = possibleNum % 5 == inputInt[1];
			boolean ifFitSeven = possibleNum % 7 == inputInt[2];
			if(ifFitFive && ifFitSeven) {
				System.out.println(possibleNum);
				return;
			}
		}
		System.out.println("No answer");
	}
}

