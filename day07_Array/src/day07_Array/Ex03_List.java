package day07_Array;

import java.util.ArrayList;

public class Ex03_List {
	public static void main(String[] args) {
		/*
		 * List
		 * - ArrayList
		 * - LinkedList
		 * - Stack...���� �ִ�.
		 * ArrayList
		 * - �����Ϳ� ���� ������ �ִ�. index�� ���� �����ϴ�.
		 * - �ߺ��� �����͸� ������ �� �ִ�.
		 * - �迭���� �ٸ��� ���� �ٸ� �ڷ����� ���� �� �ִ�.
		 * - ������ ũ�⸦ ���´�.
		 */
		ArrayList arr = new ArrayList();
		
		arr.add("123");
		arr.add("456");
		
		System.out.println(arr.get(0));
		System.out.println(arr.get(1));
		
		System.out.println("arr�� ũ�� : " + arr.size());
		
		System.out.println(arr.contains("1231"));
		
//		System.out.println(arr.remove("123"));
		System.out.println(arr.remove(1));
		System.out.println(arr);
		
		arr.clear();
		System.out.println("���� �� arr : " + arr);
	}
}
