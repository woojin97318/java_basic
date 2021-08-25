package day13_Constructor_Inheritance;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

class Timer {
	private Date date;
	private SimpleDateFormat simpl;
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public SimpleDateFormat getSimpl() {
		return simpl;
	}
	public void setSimpl(SimpleDateFormat simpl) {
		this.simpl = simpl;
	}

	public void timerFunc() {
		long time;
		
		int i = 0;
		while(i < 5) {
			time = System.currentTimeMillis();
			setSimpl(new SimpleDateFormat("yyyy�� MM�� dd�� aa hh�� mm�� ss��"));
			String str = getSimpl().format(time);
			System.out.println(str);
			try {
				Thread.sleep(1000);
			}catch (Exception e) {	}
			i++;
		}
		System.out.println();
	}
}

class Windows extends Timer{
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
	
	public void windowsFunc() {
		Scanner sc = new Scanner(System.in);
		int inputNum = 0;
		String inputKey = null;
		setMap(new HashMap());
		getMap().put("�޸���", "notepad");
		getMap().put("����", "calc");
		
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
					setPro(new ProcessBuilder((String) getMap().get(inputKey)));
					try {
						getPro().start();
						System.out.println("notepad.exe ����\n");
					} catch (IOException e) {
						e.printStackTrace();
					}
				}else if(inputKey.equals("����")) {
					setPro(new ProcessBuilder((String) getMap().get(inputKey)));
					try {
						getPro().start();
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

class Login extends Windows{
	private String userId, userPw;

	public int compare(String userId, String userPw) {
		if(userId.equals(this.userId) && userPw.equals(this.userPw))
			return 1;
		else
			return 0;
	}

	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	
	public void loginFunc() {
		Scanner sc = new Scanner(System.in);
		int inputNum = 0, result = 0;
		String inputId, inputPw;

		while(inputNum != 3) {
			System.out.println("1. �α���");
			System.out.println("2. ȸ������");
			System.out.println("3. �α׾ƿ�");
			System.out.print(">>> ");
			inputNum = sc.nextInt();
			System.out.println();

			switch(inputNum) {
			case 1 :
				System.out.print("���̵� �Է� : ");
				inputId = sc.next();
				System.out.print("��й�ȣ �Է� : ");
				inputPw = sc.next();
				result = compare(inputId, inputPw);
				if(result == 1) {
					System.out.println("���� ���\n");
					super.timerFunc();
					super.windowsFunc();
				}
				else {
					System.out.println("���� ����\n");
				}
				break;
			case 2 :
				System.out.print("���� ID : ");
				inputId = sc.next();
				System.out.print("���� PW : ");
				inputPw = sc.next();
				setUserId(inputId);
				setUserPw(inputPw);
				System.out.println("ȸ������ �Ϸ�\n");
				break;
			case 3 :
				System.out.println("�α׾ƿ��մϴ�.");
				break;
			default : 
				System.out.println("�ٽ� �Է��ϼ���.\n");
			}
		}
	}
}

public class Quiz01 {
	public static void main(String[] args) {
		Login log = new Login();
		log.loginFunc();
	}
}
