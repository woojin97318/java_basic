package day06_while;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		/*
		 * 1 ~ 10 사이의 숫자만 입력 받아 1부터 입력 받은 수까지의 합을 구하시오
		 * 10 ~ 20 사이의 숫자만 입력 받아 1부터 입력 받은 수까지의 합을 구하시오
		 */
		Scanner sc = new Scanner(System.in);
		int num = 0, sum = 0;
		// 1~10
		while(true) {
			System.out.print("1 ~ 10 사이의 숫자 입력 : ");
			num = sc.nextInt();
			if(num >= 1 && num <= 10) {
				break;
			}
			System.out.println("숫자를 다시 입력하세요.");
		}
		for(int i = 1; i <= num; i++) {
			sum += i;
		}
		System.out.println("1 부터 " + num + "까지의 합 : " + sum);
		System.out.println();
		
		// 1~100
		sum = 0;
		while(true) {
			System.out.print("10 ~ 20 사이의 숫자 입력 : ");
			num = sc.nextInt();
			if(num >= 10 && num <= 20) {
				break;
			}
			System.out.println("숫자를 다시 입력하세요.");
		}
		for(int i = 10; i <= num; i++) {
			sum += i;
		}
		System.out.println("10 부터 " + num + "까지의 합 : " + sum);
	}
}
