package swing;

import java.awt.Color;

import javax.swing.JFrame;

public class Flag {

	public static void main(String[] args) {
		//Swing
		JFrame frame = new JFrame();//����
		MyPanel mainPanel = new MyPanel();//���
		mainPanel.setSize(600,400);//�������ĳ������3:2
		mainPanel.setLocation(100,20);
		mainPanel.setBackground(Color.red);
		
		// �����յ������ڴ�����
		frame.add(mainPanel);
		frame.setSize(800,500);
		frame.setLocation(200,100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);// ���õ�ͼ�β�������ק
		frame.setLayout(null);//����м�����в��� 
		frame.setVisible(true);
	}
}
