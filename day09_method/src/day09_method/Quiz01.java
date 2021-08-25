package day09_method;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {

		Quiz01Method q = new Quiz01Method();
		Scanner sc = new Scanner(System.in);
		
		// 1. 두 수를 입력받아 큰 수를 출력하는 함수를 만드시오
		int n1 = 0, n2 = 0, max = 0;
		System.out.print("1. 두 숫자 입력 : ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		max = q.bigNum(n1, n2);	// 큰 수 판별기능
		q.bigNumPrint(n1, n2, max); // 큰 수 출력
		System.out.println();

		// 2. 입력 받은 값이 짝수인지 홀수인지 판별하는 함수 제작
		int num = 0, re = 0;
		num = q.inputNum();
		re = q.numOddEven(num);
		q.numPrint(re);
		System.out.println();
		
		// 3.
		// 3의 배수를 판별하는 함수를 만들고 이 함수를 이용하여 main에서 3의 배수만 출력
		int n = 0, r = 0;
		n = q.inputNum();
		r = q.num3x(n);
		q.num3xPrint(n, r);
		System.out.println();
		
		// 4. 수를 입력받아 소수를 판별하는 함수 제작
		int num4 = 0, re4 = 0;
		num4 = q.inputNum();
		re4 = q.primeNum(num4);
		q.primeNumPrint(re4);
		System.out.println();
		
		// 5. 절대값을 구하는 함수를 정의하시오.
		int num5 = 0;
		num5 = q.inputNum();
		num5 = q.value(num5);
		q.valuePrint(num5);
		System.out.println();
		
		// 6. 이전의 거꾸로 수를 반환하는 메소드를, 각각의 기능별로 만드시오.
		int n6 = q.inputNum();
		q.reverse(n6);
		
	}
}
