package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ʹ���ļ�����ɸ����ļ�����
 * @author Java
 *
 */
public class CopyDemo {

	public static void main(String[] args) throws IOException {
		/**
		 * ʹ���ļ���������ȡԭ�ļ�
		 * ʹ���ļ�����������ļ�д����
		 * 
		 * ���ÿ��д����˳���ԭ�ļ�������
		 * ��ȡ����д�븴���ļ���ɸ��Ʋ�����
		 */
		FileInputStream fis = new FileInputStream("image.png");
		FileOutputStream fos = new FileOutputStream("image_copy.png");
		/*byte[] data = new byte[25000];
		//int len = fis.read(data);
		fis.read(data);
		System.out.println("��ȡ�ɹ���");
		//String str = new String(data,0,len,"UTF-8");
		//data = str.getBytes("UTF-8");
		fos.write(data);
		System.out.println("���Ƴɹ���");*/
		int len = -1;
		byte[] data = new byte[1024*10];
		while ((len = fis.read(data))!=-1) {
			fos.write(data,0,len);
		}
		System.out.println("���Ƴɹ���");
		fis.close();
		fos.close();
	}

}
