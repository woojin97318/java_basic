package day14_Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Quiz01 {
	private int age;
	private String checkAge;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCheckAge() {
		return checkAge;
	}
	public void setCheckAge(String checkAge) {
		this.checkAge = checkAge;
	}

	public static void main(String[] args) throws Exception {
		Quiz01 q = new Quiz01();
		Scanner sc = new Scanner(System.in);
		String age = "aaaa";
		int result;
		
		System.out.println("���� ���α׷� �Դϴ�.");
		while(true) {
			System.out.print("������� 6�ڸ� �Է� : ");
			try {
				q.setAge(sc.nextInt());
				q.setCheckAge(Integer.toString(q.getAge()));
				if(q.getCheckAge().length() != 6) {
					System.out.println("���̰� Ʋ�Ƚ��ϴ�.");
				}else if(q.getAge() >= 900000){
					System.out.println("���� �Ұ�");
				}else {
					System.out.println("���� ����");
					break;
				}
			}catch (InputMismatchException e) {
				System.out.println("���ڸ� �Է��ϼ���!!!");
				sc.nextLine();
			}
		}
	}
}
