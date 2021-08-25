package day07_Array;

import java.util.Scanner;

public class Quiz02_Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = {10, 54, 13, 17, 25, 30};
		String odd_even = null;
		
		System.out.print("Â¦¼ö, È¦¼ö ÀÔ·Â : ");
		odd_even = sc.next();
		
		if(odd_even.equals("Â¦¼ö")) {
			for(int i = 0; i < arr.length; i++) {
				if(arr[i] % 2 == 0)
					System.out.println("Â¦¼ö : " + arr[i]);
			}
		}else {
			for(int i = 0; i < arr.length; i++) {
				if(arr[i] % 2 == 1)
					System.out.println("È¦¼ö : " + arr[i]);
			}
		}
	}
}
