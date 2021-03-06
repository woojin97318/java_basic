package day19_DB;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		DBClass db = new DBClass(); // DBClass 객체 생성 -> 생성자 호출
		Scanner sc = new Scanner(System.in);
		ArrayList<StudentDTO> list;
		int inputNum = 0, stAge, result;
		String stNum, stName;
		while(inputNum != 5) {
			System.out.println("1. 등록\n2. 전체보기\n3. 삭제\n4. 수정\n5. 종료");
			System.out.print(">>> ");
			inputNum = sc.nextInt();
			System.out.println();
			
			switch(inputNum) {
			case 1 :
				System.out.print("학번 입력 : ");
				stNum = sc.next();
				System.out.print("이름 입력 : ");
				stName = sc.next();
				System.out.print("나이 입력 : ");
				stAge = sc.nextInt();
				
				result = db.saveData(stNum, stName, stAge);
				if(result == 1) {
					System.out.println("성공적으로 저장되었습니다.\n");
				}else {
					System.out.println("동일한 아이디가 존재합니다.\n");
				}
				break;
			
			case 2 :
				list = db.getUsers();
				if(list.size() == 0) {
					System.out.println("저장된 데이터가 없습니다.\n");
				}else {
					System.out.println("--------------------------");
					for(int i = 0; i < list.size(); i++) {
						System.out.println("학번 : " + list.get(i).getStNum());
						System.out.println("이름 : " + list.get(i).getStName());
						System.out.println("나이 : " + list.get(i).getAge());
						System.out.println("--------------------------");
					}
				}
				System.out.println();
				break;
			
			case 3 :
				System.out.print("삭제 학번 입력 : ");
				stNum = sc.next();
				result = db.delete(stNum);
				if(result == 1) {
					System.out.println("삭제 되었습니다.\n");
				}else {
					System.out.println("해당 학번은 존재하지 않습니다.\n");
				}
				break;
			
			case 4 :
				System.out.print("수정할 아이디 입력(존재하는 아이디를 입력하세요) : ");
				stNum = sc.next();
				System.out.print("수정할 이름 입력 : ");
				stName = sc.next();
				System.out.print("수정할 나이 입력 : ");
				stAge = sc.nextInt();
				
				if(db.moidfy(stNum, stName, stAge) == 1) {
					System.out.println("수정이 완료되었습니다.\n");
				}else {
					System.out.println("해당 아이디는 존재하지 않습니다.\n");
				}
				break;
			
			case 5 :
				System.out.println("프로그램 종료");
				break;
			
			default :
				System.out.println("다시 입력해주세요.\n");
			}
		}
	}
}
