package day03_operator;

public class Ex05_Op {
	public static void main(String[] args) {
		/*
		 * �� ������
		 * - �� �Ǵ� ������ ǥ��
		 * - ||(or) : �ϳ��� ���� �����ϸ� ����� ��
		 * 		- true || false : true
		 * 		- false || false : true
		 * 		- (10>20) || (20 == 20) : true
		 * - &&(and) : ��ΰ� ���� �� �� / �ϳ��� ������ ������ ����
		 * 		- true && false : false
		 * 		- true && true : true
		 * 		- (10>20) && (20 == 20) : false
		 * - !(not) : ����� ���� �����ش�
		 * 		- !false : true
		 * 		- !true : false
		 */
		System.out.println(false || true);
		System.out.println(true || true);
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(!true);
	}
}
