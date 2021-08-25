package day08_Set_Map_String;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex02_Set {
	
	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		arr.add("일");
		arr.add("이");
		arr.add("삼");
		for(int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}

		/*
		 * HashMap이나 HashSet는 순차적이지 않고 List나 Array같이 인덱스로 접근이 불가능해서
		 * Iterator을 사용해 값들을 정렬시키고
		 * .hasNext()와 .next()로 값들을 출력하거나 검색한다
		 */
		Iterator it = arr.iterator();
		while(it.hasNext()) {
				System.out.println(it.next());
		}
		/*
		System.out.println(it.hasNext());
		System.out.println(it.next());

		System.out.println(it.hasNext());
		System.out.println(it.next());
		
		System.out.println(it.hasNext());
		System.out.println(it.next());
		
		System.out.println(it.hasNext());
		*/
	}
	
}
