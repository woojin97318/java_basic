package day15_Thread;

import java.util.Scanner;

class A03 extends Thread {
	public void run() {
		for( ; ; ) {
			try {
				System.out.println("����� ����ɴϴ�.");
				Thread.sleep(1000);
			}catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		A03 a = new A03();
		String message = null;
		a.setDaemon(true);
		a.start();
		for( ; ; ) {
			System.out.println("���� �޼��� : ");
			message = sc.next();
			System.out.println(message);
			if(message.equals("exit"))
				break;
		}
		System.out.println("���α׷� ����");
		System.out.println("���α׷� ����");
		System.out.println("���α׷� ����");
	}
}
