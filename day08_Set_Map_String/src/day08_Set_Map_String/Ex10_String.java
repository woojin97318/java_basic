package day08_Set_Map_String;

public class Ex10_String {

	public static void main(String[] args) {
		// .trim() -> ��, ���� ������ ����
		String str = "  Have a nice day   ";
		String result = str.trim();
		System.out.println("1. " + str);
		System.out.println("2. " + result);
		
		//.split(" ") -> " "�� �������� ���� �迭�� ����
		String[] split = result.split(" ");
		System.out.println(split[0]);
		System.out.println(split[1]);
		System.out.println(split[2]);
		System.out.println(split[3]);
		// Ÿ�� Ȯ��
		System.out.println(split.getClass().getName());
		
		// Ư�� ���ڸ� �ٸ� ���ڷ� ����
		String replace = result.replace(" ", "+++");
		System.out.println(replace);
	}
}
