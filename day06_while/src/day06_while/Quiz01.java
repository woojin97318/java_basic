package day06_while;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		/*
		 * 1 ~ 10 ������ ���ڸ� �Է� �޾� 1���� �Է� ���� �������� ���� ���Ͻÿ�
		 * 10 ~ 20 ������ ���ڸ� �Է� �޾� 1���� �Է� ���� �������� ���� ���Ͻÿ�
		 */
		Scanner sc = new Scanner(System.in);
		int num = 0, sum = 0;
		// 1~10
		while(true) {
			System.out.print("1 ~ 10 ������ ���� �Է� : ");
			num = sc.nextInt();
			if(num >= 1 && num <= 10) {
				break;
			}
			System.out.println("���ڸ� �ٽ� �Է��ϼ���.");
		}
		for(int i = 1; i <= num; i++) {
			sum += i;
		}
		System.out.println("1 ���� " + num + "������ �� : " + sum);
		System.out.println();
		
		// 1~100
		sum = 0;
		while(true) {
			System.out.print("10 ~ 20 ������ ���� �Է� : ");
			num = sc.nextInt();
			if(num >= 10 && num <= 20) {
				break;
			}
			System.out.println("���ڸ� �ٽ� �Է��ϼ���.");
		}
		for(int i = 10; i <= num; i++) {
			sum += i;
		}
		System.out.println("10 ���� " + num + "������ �� : " + sum);
	}
}
