package day06_while;

import java.util.Scanner;

public class Quiz04 {
	public static void main(String[] args) {
		// 1번(로그인 프로그램)
//		Scanner sc = new Scanner(System.in);
//		String id = null;
//		String pw = null;
//		String loginId = null;
//		String loginPw = null;
//		int num;
//		while(true) {
//			System.out.println("1. 로그인");
//			System.out.println("2. 회원가입");
//			System.out.println("3. 나가기");
//			System.out.print(">>> ");
//			num = sc.nextInt();
//			switch(num) {
//			case 1 :
//				System.out.print("아이디 입력 : ");
//				loginId = sc.next();
//				System.out.print("비밀번호 입력 : ");
//				loginPw = sc.next();
//				if(loginId.equals(id) && loginPw.equals(pw)) {
//					System.out.println("인증 성공!!!\n");
//				}else {
//					System.out.println("인증 실패!!!\n");
//				}
//				break;
//			case 2 :
//				System.out.print("저장할 아이디 입력 : ");
//				id = sc.next();
//				System.out.print("저장할 비밀번호 입력 : ");
//				pw = sc.next();
//				System.out.println("가입 완료!!!\n");
//				break;
//			case 3 :
//				System.out.println("프로그램을 종료합니다.");
//				System.exit(1);
//			}
//		}
		
		// 2번(커피자판기)
//		Scanner sc = new Scanner(System.in);
//		int money = 0, menu;
//		int coffee = 200, cocoa = 250;
//		System.out.print("요금을 투입하세요 >>> ");
//		money = sc.nextInt();
//		
//		while(true) {
//			System.out.println("========== 커피 자판기 ==========\n");
//			System.out.println("1. 커피(200)\t2. 코코아(250)\t3. 반환\t4. 종료");
//			System.out.print("메뉴를 선택하세요 >>> ");
//			menu = sc.nextInt();
//			switch(menu) {
//			case 1 :
//				if(money >= coffee) {
//					money -= coffee;
//					System.out.println("맛있게 드세요\n");
//				}else {
//					System.out.println("요금이 부족합니다\n");
//				}
//				break;
//			case 2 :
//				if(money >= cocoa) {
//					money -= cocoa;
//					System.out.println("맛있게 드세요\n");
//				}else {
//					System.out.println("요금이 부족합니다\n");
//				}
//				break;
//			case 3 : 
//				System.out.println("거스름돈 : " + money + "\n");
//				money = 0;
//				break;
//			case 4 :
//				System.out.println("프로그램을 종료합니다.");
//				System.exit(1);
//			}
//		}
	}
}
