package quiz;

import java.util.ArrayList;
import java.util.Scanner;

import day19_DB.DBClass;

public class MainClass02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DBClass02 db02 = new DBClass02(); // DBClass ��ü ���� -> ������ ȣ��
		MemberInfo02 mi02;
		ArrayList<MemberInfo02> list;
		int inputNum = 0, memAge, result;
		String memId, memName, memGender, memAddr;

		System.out.println("=== ȸ�� ���� ���α׷� ===");
		while(inputNum != 5) {
			System.out.println("1. ȸ������ ����");
			System.out.println("2. ȸ�� ���");
			System.out.println("3. ȸ������ ���� ");
			System.out.println("4. ȸ������ ����");
			System.out.println("5. ���α׷� ����");
			System.out.print(">>> ");
			inputNum = sc.nextInt();
			System.out.println();

			switch(inputNum) {
			case 1 :
				System.out.println("== ȸ������ ����Ʈ ==");
				list = db02.getMembers();
				if(list.size() == 0) {
					System.out.println("����� �����Ͱ� �����ϴ�.\n");
				}else {
					System.out.println("------------------------");
					for(int i = 0; i < list.size(); i ++) {
						System.out.println("���̵� : " + list.get(i).getMemId());						
						System.out.println("�̸� : " + list.get(i).getMemName());						
						System.out.println("���� : " + list.get(i).getMemGender());						
						System.out.println("���� : " + list.get(i).getMemAge());						
						System.out.println("�ּ� : " + list.get(i).getMemAddr());	
						System.out.println("------------------------");
					}
					System.out.println();
				}
				break;
			case 2 :
				System.out.println("== ȸ�� ��� ==");
				System.out.print("���̵� : ");
				memId = sc.next();
				System.out.print("�̸� : ");
				memName = sc.next();
				System.out.print("���� : ");
				memGender = sc.next();
				System.out.print("���� : ");
				memAge = sc.nextInt();
				System.out.print("�ּ� : ");
				memAddr = sc.next();

				result = db02.save(memId, memName, memGender, memAge, memAddr);
				if(result == 1) {
					System.out.println("���������� ����Ǿ����ϴ�.\n");
				}else {
					System.out.println("������ ���̵� �����մϴ�.\n");
				}
				break;
			case 3 :
				System.out.println("== ȸ������ ���� ==");
				System.out.print("���̵� : ");
				memId = sc.next();
				System.out.print("�̸� : ");
				memName = sc.next();
				System.out.print("���� : ");
				memGender = sc.next();
				System.out.print("���� : ");
				memAge = sc.nextInt();
				System.out.print("�ּ� : ");
				memAddr = sc.next();
				result = db02.modify(memId, memName, memGender, memAge, memAddr);
				if(result == 1) {
					System.out.println("������ �Ϸ�Ǿ����ϴ�.\n");
				}else {
					System.out.println("�������� �ʴ� ���̵��Դϴ�.\n");
				}
				break;
			case 4 :
				System.out.println("== ȸ������ ���� ==");
				System.out.print("���̵� : ");
				memId = sc.next();
				result = db02.delete(memId);
				if(result == 1) {
					System.out.println("������ �Ϸ�Ǿ����ϴ�.\n");
				}else {
					System.out.println("�������� �ʴ� ���̵��Դϴ�.\n");
				}
				break;
			case 5 :
				System.out.println("���α׷��� �����մϴ�.");
				break;
			default :
				System.out.println("�ٽ� �Է����ּ���.\n");
			}
		}
	}
}