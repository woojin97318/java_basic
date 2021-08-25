package casting;

class A01{
	public void getText() {
		System.out.println("A클래스");
	}
}

class B01 extends A01{
	public void getText() {
		System.out.println("B클래스");
	}
}

class C01 extends A01{
	public void getText() {
		System.out.println("C클래스");
	}
}

public class Ex01 {
	public static void main(String[] args) {
		/*
		 * up casting(형변환)
		 * - 자식 형태의 값을 부모 형태로 변환하는 것
		 * - 부모클래스에 포함된 메소드만 사용가능(overriding를 사용하면 사용 가능)
		 * down casting(형변환)
		 * - 부모 형태에서 자식 형태로 변환하는 것
		 */
//		B01 b = new B01();
//		b.getText();
//		C01 c = new C01();
//		c.getText();
		
		// upcasting
		A01 a = new B01();
		a.getText();
		
		a = new C01();
		a.getText();
	}
}
