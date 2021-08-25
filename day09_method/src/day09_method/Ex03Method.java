package day09_method;

import java.util.Scanner;

public class Ex03Method {
	public void sumFunc() {
		Scanner sc = new Scanner(System.in);
		int num, su, sum;
		System.out.print("첫 번째 숫자 입력 : ");
		num = sc.nextInt();
		System.out.print("두 번째 숫자 입력 : ");
		su = sc.nextInt();
		sum = num + su;
		System.out.println("두 합 : " + sum);
	}
}
