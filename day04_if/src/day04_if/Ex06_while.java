package day04_if;

import java.util.Scanner;

public class Ex06_while {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name = null;
		int num = 0, num2, sum;
		
		while(true) {
			System.out.print("이름 입력 : ");
			name = input.next();
			System.out.println("당신의 이름은 " + name + "이군요");
		}
	}
}
