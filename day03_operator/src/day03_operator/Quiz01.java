package day03_operator;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num0, num1, num2;
		String s;
		
		System.out.print("�� �Է� : ");
		num0 = sc.nextInt();
		s = (num0 % 2 == 0) ? "¦��" : "Ȧ��";
		System.out.println(num0 + " = " + s);
		s = (num0 % 3 == 0) ? "3�� ����̴�" : "3�� ����� �ƴϴ�";
		System.out.println(num0 + " = " + s);
		
		System.out.print("�� �� �Է� : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		System.out.println("num1 : " + num1 + ", num2 : " + num2);
		s = (num1 > num2) ? "num1�� num2���� ũ��" : "num2�� num1���� ũ��";
		System.out.println(s);
	}
}
