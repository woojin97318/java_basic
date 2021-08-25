package day09_method;

import java.util.Scanner;

public class Ex07Method {

	public void reverse() {
		Scanner sc = new Scanner(System.in);
		int su = 0, temp = 0;
		System.out.print("¼ö ÀÔ·Â : ");
		su = sc.nextInt();
		while(true) {
			temp = su % 10;
			su = su / 10;
			System.out.print(temp + " ");
			if(su == 0) {
				break;
			}
		}
	}
}
