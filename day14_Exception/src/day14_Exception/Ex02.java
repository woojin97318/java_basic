package day14_Exception;

class BBB {
	public int aaa;
}

class AAA extends BBB {
	public void catch1(int a) {
		System.out.println("���� : " + a);
	}
	public void catch1(String a) {
		System.out.println("���ڿ� : " + a);
	}
	public void catch1(Object a) {
		System.out.println("������Ʈ : " + a);
	}
}

public class Ex02 {
	public static void main(String[] args) {
		AAA a = new AAA();
		a.catch1(13579);
		a.catch1("�ѱ�");
		a.catch1(1.111212);
	}
}
