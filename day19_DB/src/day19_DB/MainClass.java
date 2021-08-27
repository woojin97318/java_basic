package day19_DB;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		DBClass db = new DBClass(); // DBClass ��ü ���� -> ������ ȣ��
		Scanner sc = new Scanner(System.in);
		ArrayList<StudentDTO> list;
		int inputNum = 0, stAge, result;
		String stNum, stName;
		while(inputNum != 5) {
			System.out.println("1. ���\n2. ��ü����\n3. ����\n4. ����\n5. ����");
			System.out.print(">>> ");
			inputNum = sc.nextInt();
			System.out.println();
			
			switch(inputNum) {
			case 1 :
				System.out.print("�й� �Է� : ");
				stNum = sc.next();
				System.out.print("�̸� �Է� : ");
				stName = sc.next();
				System.out.print("���� �Է� : ");
				stAge = sc.nextInt();
				
				result = db.saveData(stNum, stName, stAge);
				if(result == 1) {
					System.out.println("���������� ����Ǿ����ϴ�.\n");
				}else {
					System.out.println("������ ���̵� �����մϴ�.\n");
				}
				break;
			
			case 2 :
				list = db.getUsers();
				if(list.size() == 0) {
					System.out.println("����� �����Ͱ� �����ϴ�.\n");
				}else {
					System.out.println("--------------------------");
					for(int i = 0; i < list.size(); i++) {
						System.out.println("�й� : " + list.get(i).getStNum());
						System.out.println("�̸� : " + list.get(i).getStName());
						System.out.println("���� : " + list.get(i).getAge());
						System.out.println("--------------------------");
					}
				}
				System.out.println();
				break;
			
			case 3 :
				System.out.print("���� �й� �Է� : ");
				stNum = sc.next();
				result = db.delete(stNum);
				if(result == 1) {
					System.out.println("���� �Ǿ����ϴ�.\n");
				}else {
					System.out.println("�ش� �й��� �������� �ʽ��ϴ�.\n");
				}
				break;
			
			case 4 :
				System.out.print("������ ���̵� �Է�(�����ϴ� ���̵� �Է��ϼ���) : ");
				stNum = sc.next();
				System.out.print("������ �̸� �Է� : ");
				stName = sc.next();
				System.out.print("������ ���� �Է� : ");
				stAge = sc.nextInt();
				
				if(db.moidfy(stNum, stName, stAge) == 1) {
					System.out.println("������ �Ϸ�Ǿ����ϴ�.\n");
				}else {
					System.out.println("�ش� ���̵�� �������� �ʽ��ϴ�.\n");
				}
				break;
			
			case 5 :
				System.out.println("���α׷� ����");
				break;
			
			default :
				System.out.println("�ٽ� �Է����ּ���.\n");
			}
		}
	}
}