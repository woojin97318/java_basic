package day05_loop;

import java.util.Scanner;

public class Ex02_for {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int repet;
		System.out.println("반복 횟수 입력");
		repet = input.nextInt();
		for(int i = 0; i < repet; i++) {
			System.out.println(i + ". 반복");
		}
		
		System.out.println("=== 감소식 ===");
		for(int i = 10; i > 0; i--) {
			System.out.println(i + ". 실행");
		}
		
		System.out.println("--- 2증가 ---");
		for(int i = 0; i < 10; i+=2) {
			System.out.println(i + ". 실행");
		}
	}
}
