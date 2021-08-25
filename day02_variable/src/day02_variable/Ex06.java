package day02_variable;

import java.io.IOException;

public class Ex06 {
	public static void main(String[] args) throws IOException {
		int val;
		System.out.print("입력 : ");
		val = System.in.read();
		System.out.println("입력 data : " + (char)val);
		
		val = System.in.read();
		val = System.in.read();
		
		System.out.print("2번째 입력 : ");
		val = System.in.read();
		System.out.println("입력 data : " + (char)val);
	}
}
