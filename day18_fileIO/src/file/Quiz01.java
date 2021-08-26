package file;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

class Student implements Serializable {
	private String stNum, stName;
	private int kor, eng, math;
	public String getStNum() {
		return stNum;
	}
	public void setStNum(String stNum) {
		this.stNum = stNum;
	}
	public String getStName() {
		return stName;
	}
	public void setStName(String stName) {
		this.stName = stName;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public void print() {
		System.out.println("학번 : " + getStNum());
		System.out.println("이름 : " + getStName());
		System.out.println("국어 점수 : " + getKor());
		System.out.println("영어 점수 : " + getEng());
		System.out.println("수학 점수 : " + getMath());
	}
}

public class Quiz01 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		Student st = new Student();

		File filePath;
		int inputNum = 0, kor, eng, math;
		String stNum, stName;

		while(inputNum != 3) {
			System.out.println("1. 학생 검색");
			System.out.println("2. 학생 등록");
			System.out.println("3. 프로그램 종료");
			System.out.print(">>> ");
			inputNum = sc.nextInt();
			System.out.println();

			switch(inputNum) {
			case 1 :
				System.out.print("찾을 학생 학번 입력 : ");
				stNum = sc.next();
				filePath = new File("C:/kgitbank/4_JAVA/test/" + stNum + ".txt");
				if(filePath.createNewFile()) {
					System.out.println("찾는 학생이 없습니다.\n");
					filePath.delete();
				}else {
					FileInputStream fis = new FileInputStream(filePath);
					BufferedInputStream bis = new BufferedInputStream(fis);
					ObjectInputStream ois = new ObjectInputStream(bis);
					st = (Student)ois.readObject();
					st.print();
					ois.close();
					System.out.println();
				}
				break;
			case 2 :
				System.out.print("학번 입력 : ");
				stNum = sc.next();
				filePath = new File("C:/kgitbank/4_JAVA/test/" + stNum + ".txt");
				if(filePath.createNewFile()) {
					st.setStNum(stNum);
					System.out.print("이름 입력 : ");
					stName = sc.next();
					st.setStName(stName);
					System.out.print("국어점수 입력 : ");
					kor = sc.nextInt();
					st.setKor(kor);
					System.out.print("영어점수 입력 : ");
					eng = sc.nextInt();
					st.setEng(eng);
					System.out.print("수학점수 입력 : ");
					math = sc.nextInt();
					st.setMath(math);

					FileOutputStream fos = new FileOutputStream(filePath);
					BufferedOutputStream bos = new BufferedOutputStream(fos);
					ObjectOutputStream oos = new ObjectOutputStream(bos);
					oos.writeObject(st);
					oos.close();
					System.out.println("등록이 완료되었습니다.\n");
				}else {
					System.out.println("이미 존재하는 학번입니다.\n");
				}
				break;
			case 3 :
				System.out.println("프로그램 종료");
				break;
			default :
				System.out.println("다시 입력하세요.\n");
			}
		}
	}
}
