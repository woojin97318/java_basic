package day10_ClassVariable;

public class Ex01_Overloading {

	public static void main(String[] args) {
		/*
		 * �����ε�
		 * - �޼ҵ��� �̸��� �����ϰ� ����� ��
		 * - �̸��� ���� ������ ���� �ٸ� �޼ҵ�� �ν��ϱ� ���ؼ���
		 *   �Ű�����(�ƱԸ�Ʈ)�� ������ Ÿ��(�ڷ���)�� �޶�� �Ѵ�.
		 */
		Ex01_Class ex = new Ex01_Class();
		System.out.println(ex.sumFunc(10, 20));
		System.out.println(ex.sumFunc(10, 20, 30));
		System.out.println(ex.sumFunc(10, 2.222));
		System.out.println(ex.sumFunc("test", "hello"));
	}
}
