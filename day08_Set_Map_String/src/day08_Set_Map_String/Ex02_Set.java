package day08_Set_Map_String;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex02_Set {
	
	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		arr.add("��");
		arr.add("��");
		arr.add("��");
		for(int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}

		/*
		 * HashMap�̳� HashSet�� ���������� �ʰ� List�� Array���� �ε����� ������ �Ұ����ؼ�
		 * Iterator�� ����� ������ ���Ľ�Ű��
		 * .hasNext()�� .next()�� ������ ����ϰų� �˻��Ѵ�
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
