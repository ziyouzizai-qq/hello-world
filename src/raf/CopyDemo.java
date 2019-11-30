package raf;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * �����ļ�����
 * @author Java
 *
 */
public class CopyDemo {
	public static void main(String[] args) throws IOException, InterruptedException {
		/**
		 * ��������RAF��һ��������ԭ�ļ���
		 * һ�������������ļ���д��
		 * ˳���ԭ�ļ���ȡÿһ���ֽ�д�뵽
		 * �����ļ��С�
		 */
		RandomAccessFile src = new RandomAccessFile("image.png","r");
		
		RandomAccessFile desc = new RandomAccessFile("image_cp.png","rw");
		
		int d = -1;
		while ((d=src.read())!=-1) {
			desc.write(d);;
		}
		System.out.println("�������");
		src.close();
		desc.close();
	}
}
