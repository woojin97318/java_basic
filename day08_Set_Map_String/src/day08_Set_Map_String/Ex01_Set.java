package day08_Set_Map_String;

import java.util.ArrayList;
import java.util.HashSet;

public class Ex01_Set {
	
	public static void main(String[] args) {
		/*
		 * Set
		 * - HashSet
		 * - TreeSet..µî
		 * HashSet
		 * - ¼ø¼­ À¯Áö°¡ ¾ÈµÈ´Ù.
		 * - µ¥ÀÌÅÍÀÇ Áßº¹À» Çã¿ëÇÏÁö ¾Ê´Â´Ù.
		 */
		HashSet hs = new HashSet();
		hs.add("¶ó¸é");
		hs.add("±è¹ä");
		hs.add("¼ø´ë");
		hs.add("±è¹ä");
		System.out.println("hs : " + hs);
		hs.remove("±è¹ä");
		System.out.println("hs : " + hs);
		
		ArrayList arr = new ArrayList();
		arr.add("¶ó¸é");
		arr.add("±è¹ä");
		arr.add("¼ø´ë");
		arr.add("±è¹ä");
		System.out.println("arr : " + arr);
	}
	
}
