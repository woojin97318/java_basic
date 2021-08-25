package day10_ClassVariable;

import java.util.Scanner;

public class Quiz01_Method {

	Scanner sc = new Scanner(System.in);
	int gameNum, ranNum, inputNum, cnt = 0, highScore = 0;
	boolean gameResult;

	public int display() {
		System.out.println("======= UP & DOWN Game =======");
		System.out.println("\t1. ���� ����");
		System.out.println("\t2. ���� ����");
		System.out.println("\t3. ���� ����");
		System.out.print("\t>>> ");
		gameNum = sc.nextInt();
		System.out.println();
		return gameNum;
	}

	public void gameStart() {
		ranNum = randomNum();
		System.out.println("=== START ===");
		inputNum = inputNum();
		while(true) {
			cnt++;
			gameResult = correctFunc(inputNum, ranNum);
			if(gameResult == true)
				break;
		}
	}

	public void gameResult() {
		if(highScore == 0) {
			System.out.println("������ �������� �ʾҽ��ϴ�.\n");
		}else {
			System.out.printf("�ְ������� %dȸ �Դϴ�!!!\n\n", highScore);
		}
	}

	public void gameeEnd() {
		System.out.println("=== ���� ���� ===");
	}

	public int randomNum() {
		ranNum = (int)(Math.random()*100+1);
		System.out.println("��ǻ�� ���� : " + ranNum);
		return ranNum;
	}

	public int inputNum() {
		System.out.print("Input Number --> ");
		inputNum = sc.nextInt();
		return inputNum;
	}

	public boolean correctFunc(int inputNum, int ranNum) {
		if(ranNum > inputNum) {
			System.out.println("=== UP ===");
			inputNum();
			return false;
		}else if(ranNum < inputNum) {
			System.out.println("=== DOWN ===");
			inputNum();
			return false;
		}else {
			System.out.println(cnt + "ȸ ���� ������ϴ�!!!");
			highScoreCheckFunc(cnt);
			System.out.println();
			cnt = 0;
			return true;
		}
	}

	public void highScoreCheckFunc(int cnt) {
		if(highScore == 0) {
			System.out.println("�ְ����� �����ϼ̽��ϴ�!");
			highScore = cnt;
		}else if(cnt < highScore) {
			System.out.println("�ְ����� �����ϼ̽��ϴ�!");
			highScore = cnt;
		}
	}
}
