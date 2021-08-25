package overriding;

public class Ex01_Main {
	public static void main(String[] args) {
		/*
		 * overriding
		 * - 상속받은 자식의 메소드의 내용을 변경(업데이트)하는 것
		 * 조건
		 * - 부모 메소드의 형식과 동일하게 자식 메소드를 만드는 것
		 * 	1) 반환타입이 같아야 한다.
		 * 	2) 매개변수의 개수와 타입이 같아야 한다.
		 * 	3) 접근 제한자가 부모와 같거나 커야한다.
		 * 	- private < default(package) < protected < public
		 */
		
		NewFerrari nfe = new NewFerrari(2021, 350);
		nfe.speed();
		nfe.autoSystem();
	}
}
