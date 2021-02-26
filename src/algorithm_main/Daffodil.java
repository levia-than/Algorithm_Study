package algorithm_main;

public class Daffodil {
	public final static int MAX_VALUE = 1000;
	public final static int MIN_VALUE = 100;
	public static int first = 0;
	public static int second = 0;
	public static int third = 0;
	public static void main(String[] args) {
		for(int i = 100; i < 1000;i++) {
			first = (i / 100);
			second = (i - (100 * first)) / 10;
			third = (i - (100 * first) - (10 * second));
			boolean ifSuitable = (Math.pow(first,3)+
					Math.pow(second,3)+Math.pow(third,3)) == i;
			if(ifSuitable) {
				System.out.println(i);
			}
		}

	}

}
