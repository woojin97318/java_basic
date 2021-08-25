package day04_if;

import java.util.Scanner;

public class Ex04_switch {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int select;
		System.out.println("수 입력");
		select = input.nextInt();

		switch(select) {
		case 1 :
			System.out.println("1.입력값 : " + select);
			break;
		case 2 :
			System.out.println("2.입력값 : " + select);
			break;
		case 3 :
			System.out.println("3.입력값 : " + select);
			break;
		default :// 생략 가능
			System.out.println("1, 2, 3을 제외한 다른 값 입력");
		}
	}
}
