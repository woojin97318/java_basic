package abstract_ex;

abstract class Abstract{
	protected int num;

	public void setNum(int num) {
		this.num = num;
	}
	public abstract void combo();
}

class NewAbstract extends Abstract{
	@Override
	public void combo() {
		System.out.println(num + "단 콤보 공격 & 2대 더 떄리기");
	}
}

public class Ex01 {
	public static void main(String[] args) {
		Abstract a = new NewAbstract();
		a.setNum(3);
		a.combo();
	}
}
