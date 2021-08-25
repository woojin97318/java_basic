package day06_while;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		/*
		�� 100���� ����Ǿ� �ִ� â�� �ϼ� 1���� �㰡 �ִ�.
		�� �Ѹ����� �Ϸ翡 20g�� ���� �԰�, 10��(10, 20, 30)���� ���� ���� 2�辿 �����Ѵ�.
		��ĥ ���� â���� ���� ��� ���� ���̰� �ɱ�. �׸��� ��� �� ����ΰ�?
		(�� 1�� = 1kg) (���� ���� �Ŀ� 2�� �����ϴ� ����)
		*/
		int rice = 100000;
		int mouse = 2;
		int dayRice = 20;
		int day = 0;
		while(rice >= 0) {
			day++;
			rice -= mouse * dayRice;
			if(day % 10 == 0)
				mouse *= 2;
		}
		System.out.println("�㰡 â���� ���� �Դµ� �ҿ�� �ð� : " + day + "��");
		System.out.println("�� " + mouse + "����\n");
		
		/*
		�� ���� �ּ� ������� �ִ� ������� ���ϴ� ���α׷��� �ۼ��϶�.
		- �ּ� ����� : ����� �߿��� ���� ���� ����
		- �ִ� ����� : ����� �߿��� ���� ū ��
		*/
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		System.out.print("�� �� �Է�(�������� ����) : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		// �ּ� �����
		int i = 0;
		while(true) {
			i++;
			if(i % num1 == 0 && i % num2 == 0) {
				System.out.println(num1 + ", " + num2 + "�� �ּ� ����� : " + i);
				break;
			}
		}
		// �ִ� �����
		int max, min;
		max = num2;
		if(num1 > max) {
			max = num1;
			min = num2;
		}else {
			min = num1;
		}
		int j = max;
		while(true) {
			if(num1 % j == 0 && num2 % j == 0) {
				System.out.println(num1 + ", " + num2 + "�� �ִ� ����� : " + j);
				break;
			}
			j--;
		}
		
		/*
		� ���� ����� ���ϴ� ���α׷��� �ۼ��Ͽ���
		- ��� : � ���� ������ ���� �� �ִ� ��
		*/
		System.out.print("\n���� �Է� : ");
		int num = sc.nextInt();
		System.out.print(num + "�� ��� : ");
		for(int x = 1; x <= num; x++) {
			if(num % x == 0) {
				System.out.print(x + " ");
			}
		}
		System.out.println("\n");
		
		/*
		1���� 1000������ �ڿ����߿��� 4�� ����� 6���� ����� �������� 1�� ���� ���� ����϶�
		*/
		int sum = 0;
		for(int y = 1; y <= 1000; y++) {
			if(y % 4 == 1 && y % 6 == 1) {
				sum += y;
			}
		}
		System.out.println("4�� �� : " + sum);
	}
}
