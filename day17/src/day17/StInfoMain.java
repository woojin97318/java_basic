package day17;

import java.util.ArrayList;
import java.util.Scanner;

public class StInfoMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<StInfo> arr = new ArrayList<StInfo>();
		String name;
		int age;

		while(true) {
			System.out.println("1.��� 2.Ȯ��");
			int num = sc.nextInt();
			switch(num) {
			case 1 :
				StInfo s = new StInfo();
				System.out.print("�̸� �Է� : ");
				name = sc.next();
				System.out.print("���� �Է� : ");
				age = sc.nextInt();
				s.setAge(age);
				s.setName(name);
				arr.add(s);
				System.out.println("��� �Ǿ����ϴ�.");
				break;
			case 2 :
				for(int i = 0; i < arr.size(); i++) {
					StInfo ss = arr.get(i);
					System.out.println("�̸� : " + ss.getName());
					System.out.println("���� : " + ss.getAge());
				}
				break;
			}
		}
	}
}
