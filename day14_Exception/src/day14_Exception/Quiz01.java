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
		
		System.out.println("인증 프로그램 입니다.");
		while(true) {
			System.out.print("생년월일 6자리 입력 : ");
			try {
				q.setAge(sc.nextInt());
				q.setCheckAge(Integer.toString(q.getAge()));
				if(q.getCheckAge().length() != 6) {
					System.out.println("길이가 틀렸습니다.");
				}else if(q.getAge() >= 900000){
					System.out.println("가입 불가");
				}else {
					System.out.println("가입 가능");
					break;
				}
			}catch (InputMismatchException e) {
				System.out.println("숫자를 입력하세요!!!");
				sc.nextLine();
			}
		}
	}
}
