package day08_Set_Map_String;

import java.util.HashSet;
import java.util.Iterator;

public class Ex03_Set {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add("¿œ");
		set.add("¿Ã");
		set.add("ªÔ");
		System.out.println("set : " + set);
		
		Iterator it = set.iterator();
		while(it.hasNext()) {
//			Object o = it.next();
//			String s = (String)o;
			String s = (String)it.next();
			System.out.println(s);
		}
	}

}
