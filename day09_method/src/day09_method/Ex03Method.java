package day09_method;

import java.util.Scanner;

public class Ex03Method {
	public void sumFunc() {
		Scanner sc = new Scanner(System.in);
		int num, su, sum;
		System.out.print("ù ��° ���� �Է� : ");
		num = sc.nextInt();
		System.out.print("�� ��° ���� �Է� : ");
		su = sc.nextInt();
		sum = num + su;
		System.out.println("�� �� : " + sum);
	}
}
