package day08_Set_Map_String;

public class Quiz03 {
	public static void main(String[] args) {
		String str = "�谳�� -2017��\nȫ�浿���� -2015��\n���켱�� -2018��";
		// ���� ���� ������ replace�� �̿��ؼ� �Ʒ��� ���� ���� �� ����Ͻÿ�.
		System.out.println("===== ���� �� =====");
		System.out.println(str);
		
		System.out.println("===== ���� �� =====");
		str = str.replace("-", ":");
		String[] split = str.split("\n");
		str = "";
		for(int i = 0; i < split.length; i++) {
			String[] reStr = split[i].split(":");
			reStr[1] = reStr[1].replace(reStr[1], "1999��");
			str += reStr[0] + ":" + reStr[1] + "\n";
		}
		System.out.println(str);
	}
}
