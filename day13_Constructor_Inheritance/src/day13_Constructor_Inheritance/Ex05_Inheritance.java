package day13_Constructor_Inheritance;

class Calc01 {
	public Calc01(String s) {
		System.out.println(s + " : calc �θ� ������");
	}
	public void display() {
		System.out.println("���� ����~");
	}
}

class Computer01 extends Calc01{
	public Computer01() {
		super("�� ����");
		System.out.println("com �ڽ� ������");
	}
	public void print() {
		System.out.println("���� ��ǻ��~");
	}
}

public class Ex05_Inheritance {
	public static void main(String[] args) {
		/*
		 * ���
		 * - Extends�� ���� �����.
		 * - ���ο� ����� �߰��Ѵ�.
		 */
		Computer01 com = new Computer01();
		com.print();
		com.display();
	}
}
