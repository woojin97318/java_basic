package day07_Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex04_List {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList arr = new ArrayList();
		int num;
		String addNum, pritNum;
		System.out.print("���� ������ ���� �Է� : ");
		num = sc.nextInt();
		for(int i = 0; i < num; i++) 
		{
			System.out.print("�߰��� �� �Է� : ");
			addNum = sc.next();
			arr.add(addNum);
		}
		System.out.println("---- ���� �� ��� ----");
		for(int i = 0; i < num; i++) {
			System.out.print(arr.get(i) + " ");
		}
	}
}
