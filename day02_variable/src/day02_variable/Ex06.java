package day02_variable;

import java.io.IOException;

public class Ex06 {
	public static void main(String[] args) throws IOException {
		int val;
		System.out.print("�Է� : ");
		val = System.in.read();
		System.out.println("�Է� data : " + (char)val);
		
		val = System.in.read();
		val = System.in.read();
		
		System.out.print("2��° �Է� : ");
		val = System.in.read();
		System.out.println("�Է� data : " + (char)val);
	}
}
