package day06_while;

public class Ex01 {
	public static void main(String[] args) {
		/*
		 * while(���ǽ�) {
		 * 
		 * }
		 * for( ; ; ) {
		 * 
		 * }
		 */
		int i = 1;
		int sum = 0;
//		while(i <= 10) {
		for( ; i <= 10 ; ) {
			sum += i;
			i++;
		}
		System.out.println("1~10������ �� : " + sum);
	}
}
