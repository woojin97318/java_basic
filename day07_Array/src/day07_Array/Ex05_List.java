package day07_Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex05_List {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList food = new ArrayList();
		food.add("����");
		food.add("�ұ�");
		food.add("���");
		food.add("���");
		System.out.println(food);
		System.out.print("ã�� �� �Է� : ");
		String n = sc.next();
		System.out.println(n + " ��ġ : " + food.indexOf(n));
		
		System.out.print("\n������ ��ġ �Է� : ");
		int num = sc.nextInt();
		System.out.print("������ �� �Է� : ");
		n = sc.next();
		System.out.println("���� �� : " + food);
		food.set(num, n);
		System.out.println("���� �� : " + food);
	}
}
