package day11_set_get;

import java.util.Scanner;

public class Ex04_MainClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		int age;
		
		System.out.print("�̸� �Է� : ");
		name = sc.next();
		System.out.print("���� �Է� : ");
		age = sc.nextInt();
		
		// ��ü ���� �� setter�� ���� ������ ���� ����
		Ex04_set_get ex = new Ex04_set_get();
		ex.setName(name);
		ex.setAge(age);
		// ���̸� ������ ����ϴ� �޼ҵ� ���� �� age ����
		ex.setAge(ex.calAge(age));
		// ����� ���� getter�� ���� main���� ���
		// ��� �� : ??���� ���̴� ??�� �Դϴ�.
		System.out.printf("%s���� ���̴� %d�� �Դϴ�.",
				ex.getName(), ex.getAge());
	}
}
