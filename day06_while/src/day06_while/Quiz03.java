package day06_while;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		/*
		쌀 100통이 저장되어 있는 창고에 암수 1쌍의 쥐가 있다.
		쥐 한마리가 하루에 20g씩 쌀을 먹고, 10일(10, 20, 30)마다 쥐의 수가 2배씩 증가한다.
		며칠 만에 창고의 쌀이 모두 쥐의 먹이가 될까. 그리고 쥐는 총 몇마리인가?
		(쌀 1통 = 1kg) (쌀을 먹은 후에 2배 증가하는 조건)
		*/
		int rice = 100000;
		int mouse = 2;
		int dayRice = 20;
		int day = 0;
		while(rice >= 0) {
			day++;
			rice -= mouse * dayRice;
			if(day % 10 == 0)
				mouse *= 2;
		}
		System.out.println("쥐가 창고의 쌀을 먹는데 소요된 시간 : " + day + "일");
		System.out.println("쥐 " + mouse + "마리\n");
		
		/*
		두 수의 최소 공배수와 최대 공약수를 구하는 프로그램을 작성하라.
		- 최소 공배수 : 공배수 중에서 가장 작은 정수
		- 최대 공약수 : 공약수 중에서 가장 큰 수
		*/
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		System.out.print("두 수 입력(공백으로 구분) : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		// 최소 공배수
		int i = 0;
		while(true) {
			i++;
			if(i % num1 == 0 && i % num2 == 0) {
				System.out.println(num1 + ", " + num2 + "의 최소 공배수 : " + i);
				break;
			}
		}
		// 최대 공약수
		int max, min;
		max = num2;
		if(num1 > max) {
			max = num1;
			min = num2;
		}else {
			min = num1;
		}
		int j = max;
		while(true) {
			if(num1 % j == 0 && num2 % j == 0) {
				System.out.println(num1 + ", " + num2 + "의 최대 공약수 : " + j);
				break;
			}
			j--;
		}
		
		/*
		어떤 수의 약수를 구하는 프로그램을 작성하여라
		- 약수 : 어떤 수를 정수로 나눌 수 있는 수
		*/
		System.out.print("\n숫자 입력 : ");
		int num = sc.nextInt();
		System.out.print(num + "의 약수 : ");
		for(int x = 1; x <= num; x++) {
			if(num % x == 0) {
				System.out.print(x + " ");
			}
		}
		System.out.println("\n");
		
		/*
		1에서 1000까지의 자연수중에서 4로 나누어도 6으로 나누어도 나머지가 1인 수의 합을 출력하라
		*/
		int sum = 0;
		for(int y = 1; y <= 1000; y++) {
			if(y % 4 == 1 && y % 6 == 1) {
				sum += y;
			}
		}
		System.out.println("4번 답 : " + sum);
	}
}
