package day17;

// Á¦³×¸¯
class Print02<T>{
	public void test(T n1, T n2) {
		System.out.println(n1 + ", " + n2);
		System.out.println(n1.getClass());
	}
}

public class Ex02 {
	public static void main(String[] args) {
		Print02<Double> dou = new Print02<Double>();
		dou.test(1.11, 2.222);
		Print02<String> str = new Print02<String>();
		str.test("aa", "bb");
		Print02<Integer> in = new Print02<Integer>();
		in.test(10, 20);
	}
}
