package day10_ClassVariable;

import java.util.Scanner;

public class Ex08_ST {

	int age;
	String name;
	
	public void display() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 입력 : ");
		name = sc.next();
		System.out.print("나이 입력 : ");
		age = sc.nextInt();
		print();
	}
	public void print() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
}
