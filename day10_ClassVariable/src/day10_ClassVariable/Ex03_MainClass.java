package day10_ClassVariable;

public class Ex03_MainClass {

	public static void main(String[] args) {
		/*
		 * Ŭ���� ����
		 * - ���α׷� ���۽� ����(�޸𸮿� �ö� ��)
		 * - �������� ��� ����
		 * �ν��Ͻ�(��ü) ����
		 * - ��ü�� ������ �� ����(new ������ ��)
		 * ���� ����
		 * - Ư�� �������� ������ ��
		 * - �ش� ���������� ��� ����
		 * - �Ǵ� �ش� ������ ���ӵǾ� �ִ� ������ ��� ����
		 */

//		int cnt = 0;
//		if(cnt == 0) {
//			int test = 1000;
//			System.out.println(cnt);
//			System.out.println(test);
//		}
//		System.out.println(test);
		
		Ex03_Variable ex = new Ex03_Variable();
		int a = ex.variable01();
		ex.variable02(a);
	}
}
