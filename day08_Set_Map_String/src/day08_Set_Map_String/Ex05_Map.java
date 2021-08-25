package day08_Set_Map_String;

import java.util.HashMap;
import java.util.Scanner;

public class Ex05_Map {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		HashMap<String, String> map = new HashMap<String, String>();
		String key = null, value = null;
		
		System.out.print("저장할 키 입력 : ");
		key = sc.next();
		System.out.print("저장할 값 입력 : ");
		value = sc.next();
		map.put(key, value);
		System.out.println(map);
	}
}
