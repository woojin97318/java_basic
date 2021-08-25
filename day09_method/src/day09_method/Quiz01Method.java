package day09_method;

import java.util.Scanner;

public class Quiz01Method {

	// 1�� Method
	public int bigNum(int n1, int n2) {
		if(n1 > n2)	return n1;
		else return n2;
	}
	public void bigNumPrint(int n1, int n2, int max) {
		System.out.printf("%d�� %d�� ū ���� %d �Դϴ�\n", n1, n2, max);
	}
	
	// 2�� Method
	public int inputNum() {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("���� �Է� : ");
		num = sc.nextInt();
		return num;
	}
	public int numOddEven(int num) {
		if(num % 2 == 0)
			return 0;
		else
			return 1;
	}
	public void numPrint(int num) {
		if(num == 0)
			System.out.println("¦��");
		else
			System.out.println("Ȧ��");
		System.out.println("�Դϴ�.");
	}
	
	// 3�� Method
	public int num3x(int num) {
		if(num % 3 == 0)	return 0;
		else return 1;
	}
	public void num3xPrint(int n, int r) {
		if(r == 0) System.out.println(n + " : 3�� ����Դϴ�.");
		else	System.out.println(n + " : 3�� ����� �ƴմϴ�.");
	}
	
	// 4�� Method
	public int primeNum(int num) {
		int cnt = 0;
		for(int i = num-1; i >= 2; i--) {
			if(num % i == 0) {
				cnt++;
				break;
			}
		}
		if(cnt == 1)
			return 1;
		else
			return 0;
	}
	public void primeNumPrint(int num) {
		if(num == 1)	System.out.println("�Ҽ��� �ƴմϴ�.");
		else	System.out.println("�Ҽ��Դϴ�.");
	}
	
	// 5�� Method
	public int value(int num) {
		if(num < 0)
			num *= -1;
		return num;
	}
	public void valuePrint(int n) {
		System.out.println("���� : " + n);
	}
	
	// 6�� Method
	public void reverse(int su) {
		int temp = 0;
		while(true) {
			temp = numP(su);
			su = numD(su);
			print6(temp);
			if(su == 0) {
				break;
			}
		}
	}
	public int numP(int num) {
		return num % 10;
	}
	public int numD(int num) {
		return num / 10;
	}
	public void print6(int n) {
		System.out.print(n);
	}
}
