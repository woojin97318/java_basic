package day06_while;

public class Quiz02 {
	
	public static void main(String[] args) {
		/*
		첫날에 1원을 예금하고, 다음날에는 전날의 2배씩 증가하는 방식이다.
		30일째 되는날 예금해야하는 금액을 구하시오
		*/		
		int money = 1;
		for(int i = 1; i <= 30; i++) {
			if(i == 1)
				continue;
			money *= 2;
//			System.out.println(i + "일 : " + money);
		}
		System.out.println("30일째 예금하는 금액 : " + money + "원");
		System.out.println();
		
		/*
		1 ~ 1000까지의 합을 구하시오
		단 3의 배수는 제외하고 3의 배수이면서 5의 배수는 제외하지 않는 조건으로 구하시오
		*/
		int sum = 0;
		for(int i = 1; i <= 1000; i++) {
			if(i % 3 == 0 & i % 5 != 0) {
				continue;
			}
			sum += i;
		}
		System.out.println("3의 배수 제외, 3의 배수이며 5의 배수는 제외x");
		System.out.println("1 ~ 1000까지의 합 : " + sum);
		System.out.println();
		
		/*
		1부터 시작하여 홀수의 합을 구하면서
		그 합이 10000을 넘지않는 마지막 수를 구하는 프로그램을 작성하시오
		*/
		int num = 0;
		int oddSum = 0;
		while(true) {
			num++;
			if(num % 2 == 0)
				continue;
			oddSum += num;
			if(oddSum >= 10000)
				break;
		}
		System.out.println(num -= 2);
	}
}
