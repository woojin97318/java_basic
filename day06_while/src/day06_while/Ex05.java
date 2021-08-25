package day06_while;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1.걷기 2.대중교통 3.종료");
			int select = sc.nextInt();
			switch(select) {
			case 1 : System.out.println("걸어가자"); break;
			case 2 : System.out.println("버스타자"); break;
			case 3 : System.out.println("종료하자");
				System.exit(1);
				// 1은 강제종료의 강제성의 정도? (-1, 0, 1) -1이 강제성이 높음
			}
		}
	}
}
