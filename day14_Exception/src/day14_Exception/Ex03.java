package day14_Exception;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y, result;
		System.out.print("�� �� �Է� : ");
		try {
			x = sc.nextInt();
			y = sc.nextInt();
			result = x / y;
			System.out.println("x / y = " + result);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("�������� ������ ����");
		}
	}
}
