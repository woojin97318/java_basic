package day03_operator;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2, num3, max, hap;
		
		// 1
		System.out.print("�� �Է� : ");
		num1 = sc.nextInt();
		if(num1 % 3 == 0)
			System.out.println("3�� ��� �Դϴ�");
		if(num1 % 3 != 0)
			System.out.println("3�� ����� �ƴմϴ�");
		System.out.println();
		
		// 2
		System.out.print("�� �Է� : ");
		num1 = sc.nextInt();
		if(num1 < 0)
			num1 *= -1;
		System.out.println("���밪�� " + num1 + "�Դϴ�");
		System.out.println();
		
		// 3
		System.out.print("�� �� �Է� : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		max = num2;
		if(num1 > max)
			max = num1;
		System.out.println("ū ���� " + max + "�Դϴ�");
		
		// 4
		System.out.print("�� �� �Է� : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		max = num3;
		if(num1 > max)
			max = num1;
		if(num2 > max)
			max = num2;
		System.out.println("���� ū ���� " + max + "�Դϴ�");
		System.out.println();
		
		// 5
		System.out.print("�� �� �Է� : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		max = num2;
		if(num1 > max)
			max = num1;
		if(max % 2 == 0)
			System.out.println("ū ���� " + max + "�̸� ¦���Դϴ�");
		if(max % 2 != 0)
			System.out.println("ū ���� " + max + "�̸� ¦���� �ƴմϴ�");
		
		// 6
		System.out.print("�� �� �Է� : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		hap = num1 + num2;
		if(hap % 2 == 0 && hap % 3 == 0)
			System.out.println("�� ���� ���� " + hap + "�̸� ¦���̰� 3�� ��� �Դϴ�");
		
	}
}
