package day06_while;

public class Ex04 {
	public static void main(String[] args) {
		/*
		 * continue : �ݺ����� �������� �÷�������
		 */
		int i = 0;
		while(i < 5) {
			i++;
			if(i == 3) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println("���� ����� ����");
	}
}
