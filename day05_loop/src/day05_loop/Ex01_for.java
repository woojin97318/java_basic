package day05_loop;

public class Ex01_for {
	public static void main(String[] args) {
		/*
		 * for문은 ; 개수가 무조건 2개가 들어와야 한다
		 * 초기값 조건식 증감식은 없어도 상관없다
		 * for(초기값 ; 조건식 ; 증감식) {
		 * 		종속 문장
		 * }
		 */
		int sum = 0, cnt = 0;
		for(cnt = 1; cnt <= 10; cnt++) {
			sum += cnt;
		}
		System.out.println("sum : " + sum);
	}
}
