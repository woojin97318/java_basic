package day15_Thread;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ex04 {
	public static void main(String[] args) {
		// 제목 TEST JFrame 실행
		JFrame frame = new JFrame("TEST");
		// 프레임의 틀
		Container c = frame.getContentPane();
		JLabel label = new JLabel("Hello GUI");
		
		c.add(label);// 라벨 추가
		
		frame.setLocation(1000, 200);// 가로, 세로 위치
		
		frame.setPreferredSize(new Dimension(500, 200));// 프레임 크기
		frame.pack();// 프레임 크기 설정 값 적용
		
		Font font = new Font("D2Coding", Font.ITALIC, 32);
		label.setFont(font);
		label.setHorizontalAlignment(JLabel.CENTER);
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//닫기누를때 같이 종료
		
		label.setText("안녕하세요");
	}
}
