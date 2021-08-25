package day06_while;

public class Ex04 {
	public static void main(String[] args) {
		/*
		 * continue : 반복문의 위쪽으로 올려보낸다
		 */
		int i = 0;
		while(i < 5) {
			i++;
			if(i == 3) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println("다음 문장들 실행");
	}
}
