package file;

import java.io.File;
import java.io.FileInputStream;

public class Ex02 {
	public static void main(String[] args) throws Exception {
		File filePath = new File("C:/kgitbank/4_JAVA/test/aaa.txt");
		FileInputStream fos = new FileInputStream(filePath);
		while(true) {
			int res = fos.read();
			if(res < 0) {
				System.out.println("res : " + res);
				break;
			}
			System.out.println((char)res);
		}
	}
}
