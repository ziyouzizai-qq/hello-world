package raf;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * д���ַ�������
 * @author Java
 *
 */
public class WriteStringDemo {

	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("raf.txt", "rw");
		String line = "��Һã����ǰ��Σ�";
		/**
		 * String �ṩ��ת�������Ƶķ���
		 * byte[] getBytes()
		 * 
		 * byte[] data = line.getBytes();
		 */
		//����ָ���ַ�������ת��(�Ƽ��������÷�)
		byte[] data = line.getBytes("UTF-8");
		raf.write(data);
		System.out.println("д�����");
		raf.close();
	}

}
