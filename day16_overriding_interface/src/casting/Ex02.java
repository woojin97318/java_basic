package casting;

class Parents{
	public void familyName() {
		System.out.print("�� ");
	}
	public void name() {
		familyName();
		System.out.println("����");
	}
}

class Daughter extends Parents{
	public void name() {
		familyName();
		System.out.println("����");
	}
}

class Son extends Parents{
	public void name() {
		familyName();
		System.out.println("�Ɽ");
	}
}

public class Ex02 {
	public static void main(String[] args) {
		// upcasting
		Parents p = new Parents();
		p.name();
		p = new Daughter();
		p.name();
		p = new Son();
		p.name();
	}
}
