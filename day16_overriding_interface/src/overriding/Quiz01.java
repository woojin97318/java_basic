package overriding;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;

class Timer extends Thread{
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
	
	public void run() {
		JFrame frame = new JFrame();
		Container c = frame.getContentPane();
		JLabel label = new JLabel();
		
		c.add(label);
		
		frame.setLocation(1000, 200);// 가로, 세로 위치
		
		frame.setPreferredSize(new Dimension(800, 200));// 프레임 크기
		frame.pack();// 프레임 크기 설정 값 적용
		
		Font font = new Font("D2Coding", Font.ITALIC, 32);
		label.setFont(font);
		label.setHorizontalAlignment(JLabel.CENTER);
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//닫기누를때 같이 종료
		
		long time;
		while(true) {
			time = System.currentTimeMillis();
			setSimpl(new SimpleDateFormat("yyyy년 MM월 dd일 aa hh시 mm분 ss초"));
			String str = getSimpl().format(time);
			label.setText(str);
			try {
				Thread.sleep(1000);
			}catch (Exception e) {	}
		}
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
		getMap().put("메모장", "notepad");
		getMap().put("계산기", "calc");
		
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
					setPro(new ProcessBuilder((String) getMap().get(inputKey)));
					try {
						getPro().start();
						System.out.println("notepad.exe 실행\n");
					} catch (IOException e) {
						e.printStackTrace();
					}
				}else if(inputKey.equals("계산기")) {
					setPro(new ProcessBuilder((String) getMap().get(inputKey)));
					try {
						getPro().start();
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

class Login extends Windows{
	private String userId, userPw, str;

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
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}

	@Override
	public void run() {
		JFrame frame = new JFrame();
		Container c = frame.getContentPane();
		JLabel label = new JLabel();
		
		c.add(label);
		
		frame.setLocation(1000, 200);// 가로, 세로 위치
		
		frame.setPreferredSize(new Dimension(800, 200));// 프레임 크기
		frame.pack();// 프레임 크기 설정 값 적용
		
		Font font = new Font("D2Coding", Font.ITALIC, 32);
		label.setFont(font);
		label.setHorizontalAlignment(JLabel.CENTER);
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//닫기누를때 같이 종료
		
		int hour = 0, min = 0, sec = 0;
		while(true) {
			setStr(hour + "시간 " + min + "분 " + sec + "초 사용");
			label.setText(getStr());
			try {
				Thread.sleep(1000);
				if(sec == 59 && min == 59) {
					sec = 0;
					min = 0;
					hour++;
				}else if(sec == 59) {
					sec = 0;
					min++;
				}else {
					sec++;
				}
			}catch (Exception e) {	}
		}
	}
	
	@Override
	public void windowsFunc() {
		Scanner sc = new Scanner(System.in);
		int inputNum = 0;
		String inputKey = null;
		setMap(new HashMap());
		getMap().put("메모장", "notepad");
		getMap().put("계산기", "calc");
		
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
					setPro(new ProcessBuilder((String) getMap().get(inputKey)));
					try {
						getPro().start();
						System.out.println("notepad.exe 실행\n");
					} catch (IOException e) {
						e.printStackTrace();
					}
				}else if(inputKey.equals("계산기")) {
					setPro(new ProcessBuilder((String) getMap().get(inputKey)));
					try {
						getPro().start();
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
				System.out.println(getStr());
				stop();
				return;
			default :
				System.out.println("다시 입력하세요\n");
			}
		}
	}

	public void loginFunc() {
		Scanner sc = new Scanner(System.in);
		int inputNum = 0, result = 0;
		String inputId, inputPw;

		while(inputNum != 3) {
			System.out.println("1. 로그인");
			System.out.println("2. 회원가입");
			System.out.println("3. 로그아웃");
			System.out.print(">>> ");
			inputNum = sc.nextInt();
			System.out.println();

			switch(inputNum) {
			case 1 :
				System.out.print("아이디 입력 : ");
				inputId = sc.next();
				System.out.print("비밀번호 입력 : ");
				inputPw = sc.next();
				result = compare(inputId, inputPw);
				if(result == 1) {
					System.out.println("인증 통과\n");
					start();
					windowsFunc();
				}
				else {
					System.out.println("인증 실패\n");
				}
				break;
			case 2 :
				System.out.print("가입 ID : ");
				inputId = sc.next();
				System.out.print("가입 PW : ");
				inputPw = sc.next();
				setUserId(inputId);
				setUserPw(inputPw);
				System.out.println("회원가입 완료\n");
				break;
			case 3 :
				System.out.println("로그아웃합니다.");
				super.stop();
				break;
			default : 
				System.out.println("다시 입력하세요.\n");
			}
		}
	}
}

public class Quiz01 {
	public static void main(String[] args) {
		Login l = new Login();
		l.loginFunc();
	}
}