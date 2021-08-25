package day15_Thread;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ex04 {
	public static void main(String[] args) {
		// ���� TEST JFrame ����
		JFrame frame = new JFrame("TEST");
		// �������� Ʋ
		Container c = frame.getContentPane();
		JLabel label = new JLabel("Hello GUI");
		
		c.add(label);// �� �߰�
		
		frame.setLocation(1000, 200);// ����, ���� ��ġ
		
		frame.setPreferredSize(new Dimension(500, 200));// ������ ũ��
		frame.pack();// ������ ũ�� ���� �� ����
		
		Font font = new Font("D2Coding", Font.ITALIC, 32);
		label.setFont(font);
		label.setHorizontalAlignment(JLabel.CENTER);
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//�ݱ⴩���� ���� ����
		
		label.setText("�ȳ��ϼ���");
	}
}