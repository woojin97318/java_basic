package day11_set_get;

import java.util.Scanner;

public class Ex02_MainClass {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Ex02_This ex = new Ex02_This();
		
		System.out.print("나이 입력 : ");
		int a = sc.nextInt();
		ex.ageFunc(a);
		ex.printAge();
	}
}
