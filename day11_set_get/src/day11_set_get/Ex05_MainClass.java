package day11_set_get;

public class Ex05_MainClass {

	public static void main(String[] args) {
		int k = 100, e = 90, m = 80, s;
		double a;
		
		// ��ü ���� �� ������ ��(kor, eng, math, sum, avg)�� �����ϼ���
		Ex05_set_get ex = new Ex05_set_get();
		ex.setKor(k);
		ex.setEng(e);
		ex.setMath(m);
		s = k + e + m;
		a = s / 3.0;
		ex.setSum(s);
		ex.setAvg(a);
		// ��� �ϼ���(��, ��, ��, ��, ���)
		System.out.println("���� : " + ex.getKor());
		System.out.println("���� : " + ex.getEng());
		System.out.println("���� : " + ex.getMath());
		System.out.println("�հ� : " + ex.getSum());
		System.out.println("��� : " + ex.getAvg());
	}
}
