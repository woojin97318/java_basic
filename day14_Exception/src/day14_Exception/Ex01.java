package day14_Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		/*
		 * ���ܻ�Ȳ
		 * - ���α׷� �ǵ�(������ �ǵ�)�� �ٸ��� �����ϴ� �͵�
		 * ���� ����
		 * - ���� ���� : throw
		 * - ���� ���� : throws
		 * - ���� ó�� : try catch
		 */
		Scanner sc = new Scanner(System.in);
		int x, y, result;
		System.out.print("�� �� �Է� : ");
		try {
			x = sc.nextInt();
			y = sc.nextInt();
			result = x / y;
			System.out.println("x / y = " + result);
		}catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println("0���δ� ���� �� �����ϴ�~");
		}catch(InputMismatchException e) {
			e.printStackTrace();
			System.out.println("���ڸ� �Է��� �� �����ϴ�~");
		}
		System.out.println("���� ����� ����~");
	}
}
