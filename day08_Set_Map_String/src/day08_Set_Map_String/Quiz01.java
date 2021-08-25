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
			System.out.println("1. �޴� ���");
			System.out.println("2. �޴��� ���� ����");
			System.out.println("3. ����");
			System.out.print(">>> ");
			num = sc.nextInt();
			System.out.println();
			
			switch(num) {
			case 1 :
				System.out.print("�޴� �Է� : ");
				menu = sc.next();
				System.out.print("���� �Է� : ");
				price = sc.next();
				map.put(menu, price);
				System.out.println("��� �Ǿ����ϴ�.\n");
				break;
			case 2 :
				Iterator it = map.keySet().iterator(); 
				while(it.hasNext()) {
					String key = (String)it.next();
					System.out.println(key + " : " + map.get(key));
				}
				int num2 = 0;
				while(num2 != 3) {
					System.out.print("1. ����\t2. ����\t3. ������\n>>> ");
					num2 = sc.nextInt();
					switch(num2) {
					case 1:
						System.out.print("������ �޴� �Է� : ");
						menu = sc.next();
						if(map.containsKey(menu)) {
							System.out.print("���� ���� �Է� : ");
							price = sc.next();
							System.out.println(map.get(menu) + " -> " + price);
							map.replace(menu, price);
							System.out.println("����Ǿ����ϴ�.");
						}else {
							System.out.println("�ش� �޴��� �������� �ʽ��ϴ�.");
						}
						break;
					case 2:
						System.out.print("������ �޴� �Է� : ");
						menu = sc.next();
						if(map.containsKey(menu)) {
							map.remove(menu);
						}else {
							System.out.println("�ش� �޴��� �������� �ʽ��ϴ�.");
						}
						break;
					case 3:
						System.out.println("===== ������ =====");
						break;
					default : System.out.println("���ڸ� �ٽ� �Է����ּ���.");
					}
				}
				System.out.println();
				break;
			case 3 :
				System.out.println("===== ���α׷� ���� =====\n");
				break;
			default : System.out.println("�޴� ���ڸ� �ٽ� �Է����ּ���.\n");
			}
		}
	}
}
