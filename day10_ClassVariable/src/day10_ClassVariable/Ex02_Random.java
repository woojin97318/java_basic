package day10_ClassVariable;

public class Ex02_Random {

	public static void main(String[] args) {
		for(int i = 0; i < 100; i++) {
			int ran = (int)(Math.random()*100+1); // 1 <= ran < 101
			System.out.println(ran);
		}
	}
}
