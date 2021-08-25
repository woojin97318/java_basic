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
			System.out.println("1. 로그인");
			System.out.println("2. 회원가입");
			System.out.println("3. 로그아웃");
			System.out.print(">>> ");
			inputNum = sc.nextInt();
			System.out.println();

			switch(inputNum) {
			case 1 :
				System.out.print("아이디 입력 : ");
				inputId = sc.next();
				System.out.print("비밀번호 입력 : ");
				inputPw = sc.next();
				result = l.compare(inputId, inputPw);
				if(result == 1)
					System.out.println("인증 통과\n");
				else
					System.out.println("인증 실패\n");
				break;
			case 2 :
				System.out.print("가입 ID : ");
				inputId = sc.next();
				System.out.print("가입 PW : ");
				inputPw = sc.next();
				l.setUserId(inputId);
				l.setUserPw(inputPw);
				System.out.println("회원가입 완료\n");
				break;
			case 3 :
				System.out.println("로그아웃합니다.");
				break;
			default : 
				System.out.println("다시 입력하세요.\n");
			}
		}
	}
}
