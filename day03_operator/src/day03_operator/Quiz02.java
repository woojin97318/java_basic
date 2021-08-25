package day03_operator;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2, num3, max, hap;
		
		// 1
		System.out.print("수 입력 : ");
		num1 = sc.nextInt();
		if(num1 % 3 == 0)
			System.out.println("3의 배수 입니다");
		if(num1 % 3 != 0)
			System.out.println("3의 배수가 아닙니다");
		System.out.println();
		
		// 2
		System.out.print("수 입력 : ");
		num1 = sc.nextInt();
		if(num1 < 0)
			num1 *= -1;
		System.out.println("절대값은 " + num1 + "입니다");
		System.out.println();
		
		// 3
		System.out.print("두 수 입력 : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		max = num2;
		if(num1 > max)
			max = num1;
		System.out.println("큰 수는 " + max + "입니다");
		
		// 4
		System.out.print("세 수 입력 : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		max = num3;
		if(num1 > max)
			max = num1;
		if(num2 > max)
			max = num2;
		System.out.println("가장 큰 수는 " + max + "입니다");
		System.out.println();
		
		// 5
		System.out.print("두 수 입력 : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		max = num2;
		if(num1 > max)
			max = num1;
		if(max % 2 == 0)
			System.out.println("큰 수는 " + max + "이며 짝수입니다");
		if(max % 2 != 0)
			System.out.println("큰 수는 " + max + "이며 짝수가 아닙니다");
		
		// 6
		System.out.print("두 수 입력 : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		hap = num1 + num2;
		if(hap % 2 == 0 && hap % 3 == 0)
			System.out.println("두 수의 합은 " + hap + "이며 짝수이고 3의 배수 입니다");
		
	}
}
