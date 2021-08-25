package day06_while;

public class Quiz02 {
	
	public static void main(String[] args) {
		/*
		ù���� 1���� �����ϰ�, ���������� ������ 2�辿 �����ϴ� ����̴�.
		30��° �Ǵ³� �����ؾ��ϴ� �ݾ��� ���Ͻÿ�
		*/		
		int money = 1;
		for(int i = 1; i <= 30; i++) {
			if(i == 1)
				continue;
			money *= 2;
//			System.out.println(i + "�� : " + money);
		}
		System.out.println("30��° �����ϴ� �ݾ� : " + money + "��");
		System.out.println();
		
		/*
		1 ~ 1000������ ���� ���Ͻÿ�
		�� 3�� ����� �����ϰ� 3�� ����̸鼭 5�� ����� �������� �ʴ� �������� ���Ͻÿ�
		*/
		int sum = 0;
		for(int i = 1; i <= 1000; i++) {
			if(i % 3 == 0 & i % 5 != 0) {
				continue;
			}
			sum += i;
		}
		System.out.println("3�� ��� ����, 3�� ����̸� 5�� ����� ����x");
		System.out.println("1 ~ 1000������ �� : " + sum);
		System.out.println();
		
		/*
		1���� �����Ͽ� Ȧ���� ���� ���ϸ鼭
		�� ���� 10000�� �����ʴ� ������ ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�
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
