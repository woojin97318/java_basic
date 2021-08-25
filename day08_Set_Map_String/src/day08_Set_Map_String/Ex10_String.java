package day08_Set_Map_String;

public class Ex10_String {

	public static void main(String[] args) {
		// .trim() -> 앞, 뒤의 공백을 제거
		String str = "  Have a nice day   ";
		String result = str.trim();
		System.out.println("1. " + str);
		System.out.println("2. " + result);
		
		//.split(" ") -> " "을 기준으로 나눠 배열에 저장
		String[] split = result.split(" ");
		System.out.println(split[0]);
		System.out.println(split[1]);
		System.out.println(split[2]);
		System.out.println(split[3]);
		// 타입 확인
		System.out.println(split.getClass().getName());
		
		// 특정 문자를 다른 문자로 변경
		String replace = result.replace(" ", "+++");
		System.out.println(replace);
	}
}
