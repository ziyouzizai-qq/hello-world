package io;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * ʹ���ļ���������ȡ�ļ�����
 * @author Java
 *
 */
public class FisDemo {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("fos.dat");
		//raf�ǿ��Եõ����ȵ�
		//�������޷��õ����ȵ�
		byte[] data = new byte[200];
		int len = fis.read(data);
		System.out.println("ʵ�ʳ��ȣ�"+len);
		String str = new String(data,0,len,"UTF-8");
		System.out.println(str);
		fis.close();
	}

}
