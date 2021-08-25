package day07_Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz03_List {
	
	public static void main(String[] args) {
		/*
		# 연락처 저장 프로그램
		(ArrayList 2개를 사용하여 만드시오.)
		하나의 리스트 : 이름 정보
		하나의 리스트 : 연락처 정보
		1. 연락처 등록 : 이름과 전화번호(중복 허용x)
		2. 연락처 보기 : 등록되어 있지 않으면 "목록에 없습니다." 출력
		3. 연락처 삭제 : 목록에 없으면 "목록에 없습니다." 출력
		4. 모든 연락처 보기 : 등록되어 있는 목록 전부 출력
		*/
		Scanner sc = new Scanner(System.in);
		int num = 0;
		String inputName = null, inputTel = null;
		ArrayList name = new ArrayList();
		ArrayList tel = new ArrayList();
		
		while(num != 5) {
			System.out.println("1. 연락처 등록");
			System.out.println("2. 연락처 보기");
			System.out.println("3. 연락처 삭제");
			System.out.println("4. 모든 연락처 보기");
			System.out.println("5. 종료");
			System.out.print(">>> ");
			num = sc.nextInt();
			System.out.println();
			switch (num) {
			case 1 :
				System.out.println("===== 연락처 등록 =====");
				System.out.print("이름 입력 : ");
				inputName = sc.next();
				System.out.print("전화번호 입력 : ");
				inputTel = sc.next();
				if(tel.contains(inputTel)) {
					System.out.println("전화번호가 이미 존재합니다.\n");
				}else {
					name.add(inputName);
					tel.add(inputTel);
					System.out.println("등록되었습니다.\n");
				}
				break;
			case 2 :
				System.out.println("===== 연락처 보기 =====");
				System.out.print("찾을 이름 입력 : ");
				inputName = sc.next();
				if(name.contains(inputName)) {
					System.out.println(inputName + " : " + tel.get(name.indexOf(inputName)));
					System.out.println();
				}else {
					System.out.println(inputName + "님은 목록에 없습니다.\n");
				}
				break;
			case 3 :
				System.out.println("===== 연락처 삭제 =====");
				System.out.print("삭제할 연락처의 이름 입력 : ");
				inputName = sc.next();
				if(name.contains(inputName)) {
					System.out.println(inputName + "님 연락처가 삭제되었습니다.\n");
					tel.remove(name.indexOf(inputName));
					name.remove(inputName);
				}else {
					System.out.println("목록에 없습니다.\n");
				}
				break;
			case 4 :
				System.out.println("===== 모든 연락처 보기 =====");
				if(name.size() == 0) {
					System.out.println("저장된 연락처가 없습니다.\n");
				}else {
					for(int i = 0; i < name.size(); i++) {
						System.out.println(name.get(i) + " : " + tel.get(i));
					}
					System.out.println();
				}
				break;
			case 5 :
				System.out.println("===== 프로그램 종료 =====");
				break;
			default : 
				System.out.println("메뉴를 다시 입력해주세요.\n");
			}
		}
	}
	
}
