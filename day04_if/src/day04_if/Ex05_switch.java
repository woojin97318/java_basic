package day04_if;

import java.util.Scanner;

public class Ex05_switch {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str;
		System.out.println("문자열 입력");
		str = input.next();
		
		switch(str) {
		case "안녕" :
			System.out.println("안녕을 입력");
			break;
		case "그래" :
			System.out.println("그래를 입력");
			break;
		}
		System.out.println("다음 문장들 실행");
	}
}
