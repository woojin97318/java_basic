package day14_Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		/*
		 * 예외상황
		 * - 프로그램 의도(개발자 의도)와 다르게 동작하는 것들
		 * 예외 종류
		 * - 강제 예외 : throw
		 * - 예외 전가 : throws
		 * - 예외 처리 : try catch
		 */
		Scanner sc = new Scanner(System.in);
		int x, y, result;
		System.out.print("두 수 입력 : ");
		try {
			x = sc.nextInt();
			y = sc.nextInt();
			result = x / y;
			System.out.println("x / y = " + result);
		}catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println("0으로는 나눌 수 없습니다~");
		}catch(InputMismatchException e) {
			e.printStackTrace();
			System.out.println("문자를 입력할 수 없습니다~");
		}
		System.out.println("다음 문장들 실행~");
	}
}
