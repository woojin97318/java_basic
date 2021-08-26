package file;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class Ex03 {
	public static void main(String[] args) throws Exception {
		File filePath = new File("C:/kgitbank/4_JAVA/test/aaa.txt");
		FileOutputStream fos = new FileOutputStream(filePath);

		BufferedOutputStream bos = new BufferedOutputStream(fos);

		for(char i = '1'; i < '9'; i++) {
			//fos.write(i);
			bos.write(i);
		}
		bos.flush();
		bos.write('a');
		bos.flush();
		bos.close();
		// 이제는 다시 작성 불가능 close 떄문
	}
}
