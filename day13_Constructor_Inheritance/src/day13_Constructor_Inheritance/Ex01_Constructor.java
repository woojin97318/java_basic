package day13_Constructor_Inheritance;

class Constructor01 {
	public Constructor01(String s) {
		System.out.println("������ ���� : " + s);
	}
	public Constructor01() {
		System.out.println("default ������ ����");
	}
	public void test(String s) {
		System.out.println("test ���� : " + s);
	}
	public void test() {
		System.out.println("�⺻ test ����");
	}
}

public class Ex01_Constructor {
	public static void main(String[] args) {
		/*
		 * ������ ���
		 * - ���� �ʱ�ȭ�� �ϰ��� �� �� ����Ѵ�.
		 * - ��ü�� ������ �� �ڵ����� ȣ��ȴ�.
		 * ������ ����� ���
		 * - Ŭ���� �̸��� �����ϰ� �����.
		 * - ��ȯŸ���� ����� �ȴ�.
		 */
		Constructor01 con = new Constructor01("������ �Ű�����");
		Constructor01 con01 = new Constructor01();
		con.test("�׽�Ʈ �Ű�����");
		con.test();
	}
}
