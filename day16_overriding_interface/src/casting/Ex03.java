package casting;

class AAA{
	public String getText() {
		return "AAAŬ����";
	}
}

public class Ex03 {
	public static void main(String[] args) {
		Object a = new AAA();
		AAA aa = (AAA)a;
		aa.getText();
	}
}
