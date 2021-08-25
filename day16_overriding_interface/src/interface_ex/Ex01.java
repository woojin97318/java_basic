package interface_ex;

class A지상군{
	public void 공격() {
		System.out.println("지상군이 공격합니다");
	}
	public void 방어() {
		System.out.println("지상군이 방어합니다");
	}
}

class A공군{
	public void 미사일공격() {
		System.out.println("비행기가 공격합니다");
	}
	public void 막자() {
		System.out.println("비행기가 방어를 합니다");
	}
	public void defense() {
		System.out.println("계속적인 방어");
	}
	public void 방어() {
		System.out.println("방어회를 먹으러 가자!");
	}
}

public class Ex01 {
	public static void main(String[] args) {
		A지상군 army = new A지상군();
		army.방어();
		army.공격();
		A공군 airForce = new A공군();
		airForce.미사일공격();
		airForce.막자();
	}
}
