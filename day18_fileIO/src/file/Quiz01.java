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
		System.out.println("�й� : " + getStNum());
		System.out.println("�̸� : " + getStName());
		System.out.println("���� ���� : " + getKor());
		System.out.println("���� ���� : " + getEng());
		System.out.println("���� ���� : " + getMath());
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
			System.out.println("1. �л� �˻�");
			System.out.println("2. �л� ���");
			System.out.println("3. ���α׷� ����");
			System.out.print(">>> ");
			inputNum = sc.nextInt();
			System.out.println();

			switch(inputNum) {
			case 1 :
				System.out.print("ã�� �л� �й� �Է� : ");
				stNum = sc.next();
				filePath = new File("C:/kgitbank/4_JAVA/test/" + stNum + ".txt");
				if(filePath.createNewFile()) {
					System.out.println("ã�� �л��� �����ϴ�.\n");
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
				System.out.print("�й� �Է� : ");
				stNum = sc.next();
				filePath = new File("C:/kgitbank/4_JAVA/test/" + stNum + ".txt");
				if(filePath.createNewFile()) {
					st.setStNum(stNum);
					System.out.print("�̸� �Է� : ");
					stName = sc.next();
					st.setStName(stName);
					System.out.print("�������� �Է� : ");
					kor = sc.nextInt();
					st.setKor(kor);
					System.out.print("�������� �Է� : ");
					eng = sc.nextInt();
					st.setEng(eng);
					System.out.print("�������� �Է� : ");
					math = sc.nextInt();
					st.setMath(math);

					FileOutputStream fos = new FileOutputStream(filePath);
					BufferedOutputStream bos = new BufferedOutputStream(fos);
					ObjectOutputStream oos = new ObjectOutputStream(bos);
					oos.writeObject(st);
					oos.close();
					System.out.println("����� �Ϸ�Ǿ����ϴ�.\n");
				}else {
					System.out.println("�̹� �����ϴ� �й��Դϴ�.\n");
				}
				break;
			case 3 :
				System.out.println("���α׷� ����");
				break;
			default :
				System.out.println("�ٽ� �Է��ϼ���.\n");
			}
		}
	}
}
