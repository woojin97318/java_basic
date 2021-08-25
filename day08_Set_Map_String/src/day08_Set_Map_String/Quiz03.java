package day08_Set_Map_String;

public class Quiz03 {
	public static void main(String[] args) {
		String str = "김개똥 -2017년\n홍길동구리 -2015년\n선우선녀 -2018년";
		// 위와 같은 내용을 replace를 이용해서 아래와 같이 저장 후 출력하시오.
		System.out.println("===== 변경 전 =====");
		System.out.println(str);
		
		System.out.println("===== 변경 후 =====");
		str = str.replace("-", ":");
		String[] split = str.split("\n");
		str = "";
		for(int i = 0; i < split.length; i++) {
			String[] reStr = split[i].split(":");
			reStr[1] = reStr[1].replace(reStr[1], "1999년");
			str += reStr[0] + ":" + reStr[1] + "\n";
		}
		System.out.println(str);
	}
}
