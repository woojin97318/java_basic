package day08_Set_Map_String;

import java.util.ArrayList;

public class Quiz02 {
	public static void main(String[] args) {
		/*
		"Have a nice day Have a nice day Have a nice day"문자열에서
		'a'의 위치를 저장하여 출력
		*/
		String str = "Have a nice day Have a nice day Have a nice day";
		ArrayList arr = new ArrayList();
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == 'a') {
				arr.add(i);
			}
		}
		System.out.println("결과 : " + arr);
		System.out.println();
		
		/*
		"It is a fun java programming"문자열에서 'a'의 개수와 'g'개수와 총 개수를 출력
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
		System.out.println("총 개수 : " + allCnt);
		System.out.println("a 개수 : " + aCnt);
		System.out.println("g 개수 : " + gCnt);
		System.out.println();
		
		/*
		현재의 공백은 몇 개가 있는지 알 수 없는 상황에서 첫 번째 알파벳만 대문자로 변경하시오.
		*/
		str = new String("tESt sTring   change     first");
		String changeStr = new String();
		int k = 0;
		System.out.println("변경 전 : " + str);
		
		str = str.toLowerCase();
		// 첫 문자가 소문자이면 대문자로 변경
		if(str.charAt(0) >= 'a' && str.charAt(0) <= 'z') {
			changeStr += (char)(str.charAt(0) - 32);
			k++;
		}
		// 첫 문자가 소문자이면 다음문자부터 실행
		// 그렇지 않으면 첫 문자부터 실행
		while(k < str.length()) {
			if(str.charAt(k) != ' ') {	// 공백이 아니라면 
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
		System.out.println("변경 후 : " + changeStr);
	}
}
