package interface_ex;

import java.util.Scanner;

class B���� implements A����{
	public void �Ѿ˱���() {
		System.out.println("�Ѿ��� �����մϴ�");
	}
	@Override
	public void attack() {
		�Ѿ˱���();
		System.out.println("������ �����մϴ�");
	}
	public void ��������() {
		System.out.println("���и� �����մϴ�.");
	}
	@Override
	public void defense() {
		��������();
		System.out.println("������ ����մϴ�");
	}
}

class B���� implements A����{
	@Override
	public void attack() {
		System.out.println("������ �����մϴ�");
	}
	@Override
	public void defense() {
		System.out.println("������ ����մϴ�");
	}
}

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0, num = 0;
//		B���� ���� = new B����();
//		B���� ���� = new B����();
		A���� ���� = null;
		
		System.out.println("���� �ĵ�� �Խ��ϴ�.");
		
		System.out.println("1. ����, 2. ����");
		num = sc.nextInt();
		if(num == 1) {
			System.out.println("���� ����");
			���� = new B����();
		}else {
			System.out.println("���� ����");
			���� = new B����();
		}
		
		System.out.println("1. ����, 2. ���");
		choice = sc.nextInt();
//		if(choice == 1 && num == 1)	����.attack();
//		else if(choice == 1 && num == 2)	����.attack();
//		else if(choice == 2 && num == 1)	����.defense();
//		else	����.defense();
		if(choice == 1)	����.attack();
		else	����.defense();
	}
}
