package day10_ClassVariable;

public class Quiz01_MainClass {

	public static void main(String[] args) {

		Quiz01_Method q = new Quiz01_Method();
		int inputNum = 0;
		while(inputNum != 3) {
			inputNum = q.display();
			switch(inputNum) {
			case 1 :
				q.gameStart();
				break;
			case 2 :
				q.gameResult();
				break;
			case 3 :
				q.gameeEnd();
				break;
			default : 
				System.out.println("숫자를 다시 입력하세요.\n");
			}
		}
	}
}
