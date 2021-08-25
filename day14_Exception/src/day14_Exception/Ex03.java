package day14_Exception;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y, result;
		System.out.print("두 수 입력 : ");
		try {
			x = sc.nextInt();
			y = sc.nextInt();
			result = x / y;
			System.out.println("x / y = " + result);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("마지막에 수행할 내용");
		}
	}
}
