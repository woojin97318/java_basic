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
		q.getMap().put("�޸���", "notepad");
		q.getMap().put("����", "calc");
		
		System.out.println("=== ȯ���մϴ� ===");
		while(inputNum != 2) {
			System.out.println("1. ���");
			System.out.println("2. off");
			System.out.print(">>> ");
			inputNum = sc.nextInt();
			System.out.println();

			switch(inputNum) {
			case 1 :
				System.out.println("��� ���� ���");
				System.out.print("�޸��� / ���� : ");
				inputKey = sc.next();
				System.out.println();

				if(inputKey.equals("�޸���")) {
					q.setPro(new ProcessBuilder((String) q.getMap().get(inputKey)));
					try {
						q.getPro().start();
						System.out.println("notepad.exe ����\n");
					} catch (IOException e) {
						e.printStackTrace();
					}
				}else if(inputKey.equals("����")) {
					q.setPro(new ProcessBuilder((String) q.getMap().get(inputKey)));
					try {
						q.getPro().start();
						System.out.println("calc.exe ����\n");
					} catch (IOException e) {
						e.printStackTrace();
					}
				}else {
					System.out.println("���� ��� �Դϴ�.\n");
				}
				break;
			case 2 :
				System.out.println("���α׷� ����");
				break;
			default :
				System.out.println("�ٽ� �Է��ϼ���\n");
			}
		}
	}
}
