package day10_ClassVariable;

import java.util.Scanner;

public class Ex08_ST {

	int age;
	String name;
	
	public void display() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸� �Է� : ");
		name = sc.next();
		System.out.print("���� �Է� : ");
		age = sc.nextInt();
		print();
	}
	public void print() {
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
	}
}
