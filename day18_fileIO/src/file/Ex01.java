package file;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) throws Exception {
		File filePath = new File("C:/kgitbank/4_JAVA/test/aaa.txt");
		FileOutputStream fos = new FileOutputStream(filePath);

		fos.write(97);
		fos.write('A');

		String name = "test";

		fos.write(name.getBytes());

		// Quiz
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 입력 : ");
		String name1 = sc.next();
		System.out.print("나이 입력 : ");
		String age1 = sc.next();
		System.out.print("주소 입력 : ");
		String addr1 = sc.next();

		fos.write("\n".getBytes());
		fos.write(name1.getBytes());
		fos.write("\n".getBytes());
		fos.write(age1.getBytes());
		fos.write("\n".getBytes());
		fos.write(addr1.getBytes());
	}
}
