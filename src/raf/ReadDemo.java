package raf;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * ��ȡ�ļ�����
 * @author Java
 *
 */
public class ReadDemo {

	public static void main(String[] args) throws IOException {
		/**
		 * ��ȡ��ǰĿ¼��raf.dat�ļ�����
		 */
		RandomAccessFile raf = new RandomAccessFile("raf.dat","r");
		/**
		 * int read()
		 * ֻ��ȡһ���ֽڣ�*��������int��ʽ����
		 * ������ֵ-1���ʾ��ȡ�����ļ�ĩβ
		 */
		int d = raf.read();
		System.out.println(d);
		d = raf.read();
		System.out.println(d);
		raf.close();
	}

}
