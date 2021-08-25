package day09_method;

import java.util.Scanner;

public class Ex06 {
	
	public static void main(String[] args) {
		Ex06Method ex = new Ex06Method();
		
		ex.display();
		
		System.out.println("--- main 실행 ---");
		Scanner sc = new Scanner(System.in);
		int n1, n2;
		System.out.print("두 수 입력 : ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		int sum = ex.test(n1, n2);
		ex.printSum(n1, n2, sum);
	}
	
}
