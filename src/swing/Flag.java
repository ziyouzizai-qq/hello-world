package swing;

import java.awt.Color;

import javax.swing.JFrame;

public class Flag {

	public static void main(String[] args) {
		//Swing
		JFrame frame = new JFrame();//窗体
		MyPanel mainPanel = new MyPanel();//面板
		mainPanel.setSize(600,400);//国旗面板的长宽比例3:2
		mainPanel.setLocation(100,20);
		mainPanel.setBackground(Color.red);
		
		// 将最终的面板放在窗体上
		frame.add(mainPanel);
		frame.setSize(800,500);
		frame.setLocation(200,100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);// 画好的图形不允许拖拽
		frame.setLayout(null);//清空中间的所有布局 
		frame.setVisible(true);
	}
}
