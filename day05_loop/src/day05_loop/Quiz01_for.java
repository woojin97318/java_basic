package day05_loop;

public class Quiz01_for {
	public static void main(String[] args) {
		
		System.out.println("=== 1�� ===");
		for(int i = 1; i < 5; i++) {
			System.out.println(i + ". hello");
		}
		System.out.println();
		
		System.out.println("=== 2�� ===");
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			sum += i;
			if(sum == 528) {
				System.out.println("���� 528�϶��� i : " + i);
				break;
			}
		}
		System.out.println();
		
		System.out.println("=== 3�� ===");
		for(int i = 1; i <= 25; i++) {
			System.out.print(i + "\t");
			if(i % 5 == 0) {
				System.out.println();
			}
		}
	}
}
