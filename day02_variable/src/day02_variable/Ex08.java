package day02_variable;

import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String n1 ,n2;
		System.out.print("첫 번째 값 입력 : ");
		n1 = input.nextLine();
		System.out.print("두 번째 값 입력 : ");
		n2 = input.nextLine();
		System.out.println("첫 번째 입력 값 : " + n1);
		System.out.println("두 번째 입력 값 : " + n2);
	}
}
