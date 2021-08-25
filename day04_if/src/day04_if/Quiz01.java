package day04_if;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {

//		// 박승재 문제풀이
//		Scanner sc = new Scanner(System.in);
//		int score;
//		System.out.print("A학생의 성적 입력(0~100) : ");
//		score = sc.nextInt();
//
//		if(score < 0 || score > 100) {
//			System.out.println("0~100 범위의 값을 입력하세요.");
//		}else if(score >= 80 && score <= 100) {
//			System.out.println("A학생의 성적 : A");
//		}else if(score >= 60 && score < 80) {
//			System.out.println("A학생의 성적 : B");
//		}else if(score >= 40 && score < 60) {
//			System.out.println("A학생의 성적 : C");
//		}else if(score >= 20 && score < 40) {
//			System.out.println("A학생의 성적 : D");
//		}else {
//			System.out.println("A학생의 성적 : F");
//		}
//
//		// 전우진 문제풀이
//		Scanner sc = new Scanner(System.in);
//		int year;
//		System.out.print("연도 입력 : ");
//		year = sc.nextInt();
//
//		if(year % 4 == 0) {
//			if(year % 100 != 0 || year % 400 == 0) {
//				System.out.println("1");
//			}else {
//				System.out.println("0");
//			}
//		}
//
//		// 이주희 문제풀이
//		Scanner sc = new Scanner(System.in);
//		int kor, eng, math, avg;
//		System.out.print("B의 국어, 영어, 수학 성적 입력(순서대로) : ");
//		kor = sc.nextInt();
//		eng = sc.nextInt();
//		math = sc.nextInt();
//
//		avg = (kor + eng + math) / 3;
//		System.out.println("B의 3과목 평균 : " + avg);
//
//		if(avg  >= 80) {
//			System.out.println("참 잘했어요");
//		}else if(avg >= 60 && avg < 80) {
//			System.out.println("잘했어요");
//		}else if(avg >= 30 && avg < 60) {
//			System.out.println("아쉽네요");
//		}else {
//			System.out.println("좀 더 분발하세요");
//		}
//
//		// 김원준 문제풀이
//		Scanner sc = new Scanner(System.in);
//		int age;
//		System.out.print("나이 입력 : ");
//		age = sc.nextInt();
//
//		if(age >= 10 && age < 20) {
//			System.out.println("10대 입니다.");
//		}else if(age >= 20 && age < 30) {
//			System.out.println("20대 입니다.");
//		} else {
//			System.out.println("30대 이상입니다.");
//		}
//
//		// 오성택 문제풀이
//		Scanner sc = new Scanner(System.in);
//		int num1, num2, num3, max, min;
//		System.out.print("세 수 입력 : ");
//		num1 = sc.nextInt();
//		num2 = sc.nextInt();
//		num3 = sc.nextInt();
//
//		max = num3;
//		if(num1 > max)
//			max = num1;
//		if(num2 > max)
//			max = num2;
//		System.out.println("최댓값 : " + max);
//		min = num3;
//		if(num1 < min)
//			min = num1;
//		if(num2 < min)
//			min = num2;
//		System.out.println("최솟값 : " + min);
//
//		if(max % 3 == 0) {
//			System.out.println("최댓값 " + max + "는 3의 배수입니다.");
//		}else {
//			System.out.println("최댓값 " + max + "는 3의 배수가 아닙니다.");
//		}
//		if(min % 3 == 0) {
//			System.out.println("최솟값 " + min + "는 3의 배수입니다.");
//		}else {
//			System.out.println("최솟값 " + min + "는 3의 배수가 아닙니다.");
//		}
	}
}
