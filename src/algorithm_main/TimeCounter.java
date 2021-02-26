/**
 * 
 */
package algorithm_main;

/**
 * @author lion messi
 * @version 1.0
 */
public class TimeCounter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		for (int i=0;i<=10000;i++) {
			int n = 0;
			n = n + 1;
		}
		long endTime = System.currentTimeMillis();
		float Time = endTime - startTime;
		System.out.printf("%.10f",Time);
	}

}
