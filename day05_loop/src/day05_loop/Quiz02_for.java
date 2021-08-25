package day05_loop;

public class Quiz02_for {
	public static void main(String[] args) {
		
		System.out.println("====== 1¹ø ======");
		for(int i = 1; i <= 9; i++) {
			for(int j = 2; j <= 9; j++) {
				System.out.print(j + " * " + i + " = " + j*i + "\t");
			}
			System.out.println();
		}
		
		System.out.println("====== 2¹ø ======");
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				System.out.print((i * j) + "\t");
			}
			System.out.println();
		}
		
		System.out.println("====== 3¹ø ======");
		for(int i = 0; i <= 20; i+=5) {
			for(int j = 1; j <= 5; j++) {
				System.out.print((i + j) + "\t");
			}
			System.out.println();
		}
	}
}
