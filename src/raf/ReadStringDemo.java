package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * ��ȡ�ַ���
 * @author Java
 *
 */
public class ReadStringDemo {

	public static void main(String[] args) throws IOException {
		/**
		 * ��raf.txt�ļ��е��ַ���ȡ����
		 */
		RandomAccessFile raf = new RandomAccessFile("raf.txt", "r");
		byte[] data = new byte[(int)raf.length()];
		raf.read(data);
		String str = new String(data,"UTF-8");
		System.out.println(str);
		raf.close();
	}

}
