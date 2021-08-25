package day07_Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz03_List {
	
	public static void main(String[] args) {
		/*
		# ����ó ���� ���α׷�
		(ArrayList 2���� ����Ͽ� ����ÿ�.)
		�ϳ��� ����Ʈ : �̸� ����
		�ϳ��� ����Ʈ : ����ó ����
		1. ����ó ��� : �̸��� ��ȭ��ȣ(�ߺ� ���x)
		2. ����ó ���� : ��ϵǾ� ���� ������ "��Ͽ� �����ϴ�." ���
		3. ����ó ���� : ��Ͽ� ������ "��Ͽ� �����ϴ�." ���
		4. ��� ����ó ���� : ��ϵǾ� �ִ� ��� ���� ���
		*/
		Scanner sc = new Scanner(System.in);
		int num = 0;
		String inputName = null, inputTel = null;
		ArrayList name = new ArrayList();
		ArrayList tel = new ArrayList();
		
		while(num != 5) {
			System.out.println("1. ����ó ���");
			System.out.println("2. ����ó ����");
			System.out.println("3. ����ó ����");
			System.out.println("4. ��� ����ó ����");
			System.out.println("5. ����");
			System.out.print(">>> ");
			num = sc.nextInt();
			System.out.println();
			switch (num) {
			case 1 :
				System.out.println("===== ����ó ��� =====");
				System.out.print("�̸� �Է� : ");
				inputName = sc.next();
				System.out.print("��ȭ��ȣ �Է� : ");
				inputTel = sc.next();
				if(tel.contains(inputTel)) {
					System.out.println("��ȭ��ȣ�� �̹� �����մϴ�.\n");
				}else {
					name.add(inputName);
					tel.add(inputTel);
					System.out.println("��ϵǾ����ϴ�.\n");
				}
				break;
			case 2 :
				System.out.println("===== ����ó ���� =====");
				System.out.print("ã�� �̸� �Է� : ");
				inputName = sc.next();
				if(name.contains(inputName)) {
					System.out.println(inputName + " : " + tel.get(name.indexOf(inputName)));
					System.out.println();
				}else {
					System.out.println(inputName + "���� ��Ͽ� �����ϴ�.\n");
				}
				break;
			case 3 :
				System.out.println("===== ����ó ���� =====");
				System.out.print("������ ����ó�� �̸� �Է� : ");
				inputName = sc.next();
				if(name.contains(inputName)) {
					System.out.println(inputName + "�� ����ó�� �����Ǿ����ϴ�.\n");
					tel.remove(name.indexOf(inputName));
					name.remove(inputName);
				}else {
					System.out.println("��Ͽ� �����ϴ�.\n");
				}
				break;
			case 4 :
				System.out.println("===== ��� ����ó ���� =====");
				if(name.size() == 0) {
					System.out.println("����� ����ó�� �����ϴ�.\n");
				}else {
					for(int i = 0; i < name.size(); i++) {
						System.out.println(name.get(i) + " : " + tel.get(i));
					}
					System.out.println();
				}
				break;
			case 5 :
				System.out.println("===== ���α׷� ���� =====");
				break;
			default : 
				System.out.println("�޴��� �ٽ� �Է����ּ���.\n");
			}
		}
	}
	
}
