package overriding;

import java.util.ArrayList;

class AA extends ArrayList{
	public void aa() {
		System.out.println("������ ����Դϴ�");
	}
	@Override
	public Object get(int i) {
		return "�������� get�̴�";
	}
	public boolean add(Object o) {
		System.out.println("�߰��ϴ� ��� �Դϴ�");
		return true;
	}
}

final class BB{
	public void bb() {
		System.out.println("bb�� ����Դϴ�");
	}
}

class CC {
	BB b = new BB();
	public void bb() {
		b.bb();
		System.out.println("cc�� ����Դϴ�");
	}
}

public class Ex02_Main {
	public static void main(String[] args) {
		AA a = new AA();
		a.add("�ȳ��ϼ���");
		System.out.println("���尪 : "+a.get(0));
		
		CC c = new CC();
		c.bb();
	}
}
