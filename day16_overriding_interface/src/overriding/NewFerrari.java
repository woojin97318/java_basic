package overriding;

public class NewFerrari extends Ferrari{
	public NewFerrari(int ye, int speed) {
		super(ye, speed);
	}
	public void autoSystem() {
		System.out.println("�ڵ� ���� ��带 �����մϴ�");
	}
	public void speed() {
		System.out.println(getYe() + "�� ��� �ӵ� " + super.getSpeed() + "km �Դϴ�.");
		System.out.println("�ͺ� �������� �����մϴ�");
	}
	
}
