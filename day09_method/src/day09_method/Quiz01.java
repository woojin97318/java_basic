package day09_method;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {

		Quiz01Method q = new Quiz01Method();
		Scanner sc = new Scanner(System.in);
		
		// 1. �� ���� �Է¹޾� ū ���� ����ϴ� �Լ��� ����ÿ�
		int n1 = 0, n2 = 0, max = 0;
		System.out.print("1. �� ���� �Է� : ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		max = q.bigNum(n1, n2);	// ū �� �Ǻ����
		q.bigNumPrint(n1, n2, max); // ū �� ���
		System.out.println();

		// 2. �Է� ���� ���� ¦������ Ȧ������ �Ǻ��ϴ� �Լ� ����
		int num = 0, re = 0;
		num = q.inputNum();
		re = q.numOddEven(num);
		q.numPrint(re);
		System.out.println();
		
		// 3.
		// 3�� ����� �Ǻ��ϴ� �Լ��� ����� �� �Լ��� �̿��Ͽ� main���� 3�� ����� ���
		int n = 0, r = 0;
		n = q.inputNum();
		r = q.num3x(n);
		q.num3xPrint(n, r);
		System.out.println();
		
		// 4. ���� �Է¹޾� �Ҽ��� �Ǻ��ϴ� �Լ� ����
		int num4 = 0, re4 = 0;
		num4 = q.inputNum();
		re4 = q.primeNum(num4);
		q.primeNumPrint(re4);
		System.out.println();
		
		// 5. ���밪�� ���ϴ� �Լ��� �����Ͻÿ�.
		int num5 = 0;
		num5 = q.inputNum();
		num5 = q.value(num5);
		q.valuePrint(num5);
		System.out.println();
		
		// 6. ������ �Ųٷ� ���� ��ȯ�ϴ� �޼ҵ带, ������ ��ɺ��� ����ÿ�.
		int n6 = q.inputNum();
		q.reverse(n6);
		
	}
}
