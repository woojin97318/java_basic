package day07_Array;

import java.util.Scanner;

public class Quiz02_Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = {10, 54, 13, 17, 25, 30};
		String odd_even = null;
		
		System.out.print("礎熱, �汝� 殮溘 : ");
		odd_even = sc.next();
		
		if(odd_even.equals("礎熱")) {
			for(int i = 0; i < arr.length; i++) {
				if(arr[i] % 2 == 0)
					System.out.println("礎熱 : " + arr[i]);
			}
		}else {
			for(int i = 0; i < arr.length; i++) {
				if(arr[i] % 2 == 1)
					System.out.println("�汝� : " + arr[i]);
			}
		}
	}
}
