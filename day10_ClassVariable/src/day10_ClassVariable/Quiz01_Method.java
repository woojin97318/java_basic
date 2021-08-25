package day10_ClassVariable;

import java.util.Scanner;

public class Quiz01_Method {

	Scanner sc = new Scanner(System.in);
	int gameNum, ranNum, inputNum, cnt = 0, highScore = 0;
	boolean gameResult;

	public int display() {
		System.out.println("======= UP & DOWN Game =======");
		System.out.println("\t1. 게임 시작");
		System.out.println("\t2. 게임 전적");
		System.out.println("\t3. 게임 종료");
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
			System.out.println("게임을 시작하지 않았습니다.\n");
		}else {
			System.out.printf("최고점수는 %d회 입니다!!!\n\n", highScore);
		}
	}

	public void gameeEnd() {
		System.out.println("=== 게임 종료 ===");
	}

	public int randomNum() {
		ranNum = (int)(Math.random()*100+1);
		System.out.println("컴퓨터 숫자 : " + ranNum);
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
			System.out.println(cnt + "회 만에 맞췄습니다!!!");
			highScoreCheckFunc(cnt);
			System.out.println();
			cnt = 0;
			return true;
		}
	}

	public void highScoreCheckFunc(int cnt) {
		if(highScore == 0) {
			System.out.println("최고기록을 갱신하셨습니다!");
			highScore = cnt;
		}else if(cnt < highScore) {
			System.out.println("최고기록을 갱신하셨습니다!");
			highScore = cnt;
		}
	}
}
