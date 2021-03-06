package quiz;

import java.util.ArrayList;
import java.util.Scanner;

import day19_DB.DBClass;

public class MainClass02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DBClass02 db02 = new DBClass02(); // DBClass 객체 생성 -> 생성자 호출
		MemberInfo02 mi02;
		ArrayList<MemberInfo02> list;
		int inputNum = 0, memAge, result;
		String memId, memName, memGender, memAddr;

		System.out.println("=== 회원 관리 프로그램 ===");
		while(inputNum != 5) {
			System.out.println("1. 회원정보 보기");
			System.out.println("2. 회원 등록");
			System.out.println("3. 회원정보 수정 ");
			System.out.println("4. 회원정보 삭제");
			System.out.println("5. 프로그램 종료");
			System.out.print(">>> ");
			inputNum = sc.nextInt();
			System.out.println();

			switch(inputNum) {
			case 1 :
				System.out.println("== 회원정보 리스트 ==");
				list = db02.getMembers();
				if(list.size() == 0) {
					System.out.println("저장된 데이터가 없습니다.\n");
				}else {
					System.out.println("------------------------");
					for(int i = 0; i < list.size(); i ++) {
						System.out.println("아이디 : " + list.get(i).getMemId());						
						System.out.println("이름 : " + list.get(i).getMemName());						
						System.out.println("성별 : " + list.get(i).getMemGender());						
						System.out.println("나이 : " + list.get(i).getMemAge());						
						System.out.println("주소 : " + list.get(i).getMemAddr());	
						System.out.println("------------------------");
					}
					System.out.println();
				}
				break;
			case 2 :
				System.out.println("== 회원 등록 ==");
				System.out.print("아이디 : ");
				memId = sc.next();
				System.out.print("이름 : ");
				memName = sc.next();
				System.out.print("성별 : ");
				memGender = sc.next();
				System.out.print("나이 : ");
				memAge = sc.nextInt();
				System.out.print("주소 : ");
				memAddr = sc.next();

				result = db02.save(memId, memName, memGender, memAge, memAddr);
				if(result == 1) {
					System.out.println("성공적으로 저장되었습니다.\n");
				}else {
					System.out.println("동일한 아이디가 존재합니다.\n");
				}
				break;
			case 3 :
				System.out.println("== 회원정보 수정 ==");
				System.out.print("아이디 : ");
				memId = sc.next();
				System.out.print("이름 : ");
				memName = sc.next();
				System.out.print("성별 : ");
				memGender = sc.next();
				System.out.print("나이 : ");
				memAge = sc.nextInt();
				System.out.print("주소 : ");
				memAddr = sc.next();
				result = db02.modify(memId, memName, memGender, memAge, memAddr);
				if(result == 1) {
					System.out.println("수정이 완료되었습니다.\n");
				}else {
					System.out.println("존재하지 않는 아이디입니다.\n");
				}
				break;
			case 4 :
				System.out.println("== 회원정보 삭제 ==");
				System.out.print("아이디 : ");
				memId = sc.next();
				result = db02.delete(memId);
				if(result == 1) {
					System.out.println("삭제가 완료되었습니다.\n");
				}else {
					System.out.println("존재하지 않는 아이디입니다.\n");
				}
				break;
			case 5 :
				System.out.println("프로그램을 종료합니다.");
				break;
			default :
				System.out.println("다시 입력해주세요.\n");
			}
		}
	}
}
