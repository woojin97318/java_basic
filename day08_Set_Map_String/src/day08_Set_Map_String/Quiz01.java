package day08_Set_Map_String;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		String menu = null, price = null;
		HashMap<String, String> map = new HashMap<String, String>();
		
		while(num != 3) {
			System.out.println("1. 메뉴 등록");
			System.out.println("2. 메뉴별 가격 보기");
			System.out.println("3. 종료");
			System.out.print(">>> ");
			num = sc.nextInt();
			System.out.println();
			
			switch(num) {
			case 1 :
				System.out.print("메뉴 입력 : ");
				menu = sc.next();
				System.out.print("가격 입력 : ");
				price = sc.next();
				map.put(menu, price);
				System.out.println("등록 되었습니다.\n");
				break;
			case 2 :
				Iterator it = map.keySet().iterator(); 
				while(it.hasNext()) {
					String key = (String)it.next();
					System.out.println(key + " : " + map.get(key));
				}
				int num2 = 0;
				while(num2 != 3) {
					System.out.print("1. 수정\t2. 삭제\t3. 나가기\n>>> ");
					num2 = sc.nextInt();
					switch(num2) {
					case 1:
						System.out.print("변경할 메뉴 입력 : ");
						menu = sc.next();
						if(map.containsKey(menu)) {
							System.out.print("수정 가격 입력 : ");
							price = sc.next();
							System.out.println(map.get(menu) + " -> " + price);
							map.replace(menu, price);
							System.out.println("변경되었습니다.");
						}else {
							System.out.println("해당 메뉴가 존재하지 않습니다.");
						}
						break;
					case 2:
						System.out.print("삭제할 메뉴 입력 : ");
						menu = sc.next();
						if(map.containsKey(menu)) {
							map.remove(menu);
						}else {
							System.out.println("해당 메뉴가 존재하지 않습니다.");
						}
						break;
					case 3:
						System.out.println("===== 나가기 =====");
						break;
					default : System.out.println("숫자를 다시 입력해주세요.");
					}
				}
				System.out.println();
				break;
			case 3 :
				System.out.println("===== 프로그램 종료 =====\n");
				break;
			default : System.out.println("메뉴 숫자를 다시 입력해주세요.\n");
			}
		}
	}
}
