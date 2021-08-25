package day12_OOP;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

class Quiz02class{
	private ProcessBuilder pro;
	private HashMap map;
	
	public ProcessBuilder getPro() {
		return pro;
	}
	public void setPro(ProcessBuilder pro) {
		this.pro = pro;
	}
	public HashMap getMap() {
		return map;
	}
	public void setMap(HashMap map) {
		this.map = map;
	}
	
}

public class Quiz02 {
	public static void main(String[] args) {
		Quiz02class q = new Quiz02class();
		Scanner sc = new Scanner(System.in);
		int inputNum = 0;
		String inputKey = null;
		q.setMap(new HashMap());
		q.getMap().put("메모장", "notepad");
		q.getMap().put("계산기", "calc");
		
		System.out.println("=== 환영합니다 ===");
		while(inputNum != 2) {
			System.out.println("1. 기능");
			System.out.println("2. off");
			System.out.print(">>> ");
			inputNum = sc.nextInt();
			System.out.println();

			switch(inputNum) {
			case 1 :
				System.out.println("사용 가능 기능");
				System.out.print("메모장 / 계산기 : ");
				inputKey = sc.next();
				System.out.println();

				if(inputKey.equals("메모장")) {
					q.setPro(new ProcessBuilder((String) q.getMap().get(inputKey)));
					try {
						q.getPro().start();
						System.out.println("notepad.exe 실행\n");
					} catch (IOException e) {
						e.printStackTrace();
					}
				}else if(inputKey.equals("계산기")) {
					q.setPro(new ProcessBuilder((String) q.getMap().get(inputKey)));
					try {
						q.getPro().start();
						System.out.println("calc.exe 실행\n");
					} catch (IOException e) {
						e.printStackTrace();
					}
				}else {
					System.out.println("없는 기능 입니다.\n");
				}
				break;
			case 2 :
				System.out.println("프로그램 종료");
				break;
			default :
				System.out.println("다시 입력하세요\n");
			}
		}
	}
}
