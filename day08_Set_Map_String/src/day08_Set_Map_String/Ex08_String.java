package day08_Set_Map_String;

public class Ex08_String {
	public static void main(String[] args) {
		String str = "Java is Easy. �׸��� programming �Ҹ��ϴ�.";
		String changeStr = new String();
		
		System.out.println("�⺻ : " + str);
		
		changeStr = str.toUpperCase();
		System.out.println("��ȯ : " + changeStr);
		
		changeStr = str.toLowerCase();
		System.out.println("��ȯ : " + changeStr);
	}
}
