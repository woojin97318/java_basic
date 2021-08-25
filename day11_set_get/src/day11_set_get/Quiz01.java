package day11_set_get;

import java.util.Scanner;

class Login{
	private String userId, userPw;

	public int compare(String userId, String userPw) {
		if(userId.equals(this.userId) && userPw.equals(this.userPw))
			return 1;
		else
			return 0;
	}

	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	
}

public class Quiz01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Login l = new Login();
		int inputNum = 0, result = 0;
		String inputId, inputPw;

		while(inputNum != 3) {
			System.out.println("1. �α���");
			System.out.println("2. ȸ������");
			System.out.println("3. �α׾ƿ�");
			System.out.print(">>> ");
			inputNum = sc.nextInt();
			System.out.println();

			switch(inputNum) {
			case 1 :
				System.out.print("���̵� �Է� : ");
				inputId = sc.next();
				System.out.print("��й�ȣ �Է� : ");
				inputPw = sc.next();
				result = l.compare(inputId, inputPw);
				if(result == 1)
					System.out.println("���� ���\n");
				else
					System.out.println("���� ����\n");
				break;
			case 2 :
				System.out.print("���� ID : ");
				inputId = sc.next();
				System.out.print("���� PW : ");
				inputPw = sc.next();
				l.setUserId(inputId);
				l.setUserPw(inputPw);
				System.out.println("ȸ������ �Ϸ�\n");
				break;
			case 3 :
				System.out.println("�α׾ƿ��մϴ�.");
				break;
			default : 
				System.out.println("�ٽ� �Է��ϼ���.\n");
			}
		}
	}
}
