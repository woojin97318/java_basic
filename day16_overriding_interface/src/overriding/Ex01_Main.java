package overriding;

public class Ex01_Main {
	public static void main(String[] args) {
		/*
		 * overriding
		 * - ��ӹ��� �ڽ��� �޼ҵ��� ������ ����(������Ʈ)�ϴ� ��
		 * ����
		 * - �θ� �޼ҵ��� ���İ� �����ϰ� �ڽ� �޼ҵ带 ����� ��
		 * 	1) ��ȯŸ���� ���ƾ� �Ѵ�.
		 * 	2) �Ű������� ������ Ÿ���� ���ƾ� �Ѵ�.
		 * 	3) ���� �����ڰ� �θ�� ���ų� Ŀ���Ѵ�.
		 * 	- private < default(package) < protected < public
		 */
		
		NewFerrari nfe = new NewFerrari(2021, 350);
		nfe.speed();
		nfe.autoSystem();
	}
}
