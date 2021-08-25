package day17;

import java.util.ArrayList;

public class Ex03 {
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<String>();
		
		arr.add("aaa");
		arr.get(0);
		
		String s = arr.get(0) + "AAA";
		System.out.println(s);
	}
}
