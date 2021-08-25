package overriding;

import java.util.ArrayList;

class AA extends ArrayList{
	public void aa() {
		System.out.println("나만의 기능입니다");
	}
	@Override
	public Object get(int i) {
		return "내가만든 get이다";
	}
	public boolean add(Object o) {
		System.out.println("추가하는 기능 입니다");
		return true;
	}
}

final class BB{
	public void bb() {
		System.out.println("bb의 기능입니다");
	}
}

class CC {
	BB b = new BB();
	public void bb() {
		b.bb();
		System.out.println("cc의 기능입니다");
	}
}

public class Ex02_Main {
	public static void main(String[] args) {
		AA a = new AA();
		a.add("안녕하세요");
		System.out.println("저장값 : "+a.get(0));
		
		CC c = new CC();
		c.bb();
	}
}
