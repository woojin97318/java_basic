package day03_operator;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num0, num1, num2;
		String s;
		
		System.out.print("수 입력 : ");
		num0 = sc.nextInt();
		s = (num0 % 2 == 0) ? "짝수" : "홀수";
		System.out.println(num0 + " = " + s);
		s = (num0 % 3 == 0) ? "3의 배수이다" : "3의 배수가 아니다";
		System.out.println(num0 + " = " + s);
		
		System.out.print("두 수 입력 : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		System.out.println("num1 : " + num1 + ", num2 : " + num2);
		s = (num1 > num2) ? "num1이 num2보다 크다" : "num2가 num1보다 크다";
		System.out.println(s);
	}
}
