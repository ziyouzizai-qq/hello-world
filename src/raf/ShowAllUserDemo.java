package raf;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * ��ʾ����ע���û���Ϣ
 * @author Java
 *
 */
public class ShowAllUserDemo {

	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("user.dat", "r");
		/**
		 * ѭ����ȡ�����ֽ�
		 */
		for (int i = 0; i < raf.length()/100; i++) {
			//���û���
			//1�ȶ�ȡ32�ֽ�
			byte[] data = new byte[32];
			raf.read(data);
			//2���ֽ�����ת��Ϊ�ַ���
			String username = new String(data,"UTF-8").trim();
			//������
			raf.read(data);
			String password = new String(data,"UTF-8").trim();
			//������
			raf.read(data);
			String nickname = new String(data,"UTF-8").trim();
			//������
			int age = raf.readInt();
			System.out.println(username+","+password+","+nickname+","+age);
		}
		raf.close();
	}

}
