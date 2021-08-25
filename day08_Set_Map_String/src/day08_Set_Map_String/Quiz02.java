package day08_Set_Map_String;

import java.util.ArrayList;

public class Quiz02 {
	public static void main(String[] args) {
		/*
		"Have a nice day Have a nice day Have a nice day"���ڿ�����
		'a'�� ��ġ�� �����Ͽ� ���
		*/
		String str = "Have a nice day Have a nice day Have a nice day";
		ArrayList arr = new ArrayList();
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == 'a') {
				arr.add(i);
			}
		}
		System.out.println("��� : " + arr);
		System.out.println();
		
		/*
		"It is a fun java programming"���ڿ����� 'a'�� ������ 'g'������ �� ������ ���
		*/
		str = "It is a fun java programming";
		int aCnt = 0, gCnt = 0, allCnt = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == 'a') {
				aCnt++;
				allCnt++;
			}else if(str.charAt(i) == 'g') {
				gCnt++;
				allCnt++;
			}else {
				allCnt++;
			}
		}
		System.out.println("�� ���� : " + allCnt);
		System.out.println("a ���� : " + aCnt);
		System.out.println("g ���� : " + gCnt);
		System.out.println();
		
		/*
		������ ������ �� ���� �ִ��� �� �� ���� ��Ȳ���� ù ��° ���ĺ��� �빮�ڷ� �����Ͻÿ�.
		*/
		str = new String("tESt sTring   change     first");
		String changeStr = new String();
		int k = 0;
		System.out.println("���� �� : " + str);
		
		str = str.toLowerCase();
		// ù ���ڰ� �ҹ����̸� �빮�ڷ� ����
		if(str.charAt(0) >= 'a' && str.charAt(0) <= 'z') {
			changeStr += (char)(str.charAt(0) - 32);
			k++;
		}
		// ù ���ڰ� �ҹ����̸� �������ں��� ����
		// �׷��� ������ ù ���ں��� ����
		while(k < str.length()) {
			if(str.charAt(k) != ' ') {	// ������ �ƴ϶�� 
				changeStr += str.charAt(k);	//
				k++;
				continue;
			}
			while(str.charAt(k) == ' ') {
				changeStr += str.charAt(k);
				k++;
			}
			if(str.charAt(k) >= 'a' && str.charAt(k) <= 'z') {
				changeStr += (char)(str.charAt(k)-32);
				k++;
			}
		}
		System.out.println("���� �� : " + changeStr);
	}
}
