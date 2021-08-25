package day11_set_get;

public class Ex05_MainClass {

	public static void main(String[] args) {
		int k = 100, e = 90, m = 80, s;
		double a;
		
		// 객체 생성 후 각각의 값(kor, eng, math, sum, avg)을 저장하세요
		Ex05_set_get ex = new Ex05_set_get();
		ex.setKor(k);
		ex.setEng(e);
		ex.setMath(m);
		s = k + e + m;
		a = s / 3.0;
		ex.setSum(s);
		ex.setAvg(a);
		// 출력 하세요(국, 영, 수, 합, 평균)
		System.out.println("국어 : " + ex.getKor());
		System.out.println("영어 : " + ex.getEng());
		System.out.println("수학 : " + ex.getMath());
		System.out.println("합계 : " + ex.getSum());
		System.out.println("평균 : " + ex.getAvg());
	}
}
