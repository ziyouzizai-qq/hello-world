package io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ת����
 * java.io.InputStreamReader
 * @author Java
 *
 */
public class IsrDemo {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("osw.txt");
		InputStreamReader isr = new InputStreamReader(fis,"UTF-8");
		/**
		 * �ַ����ķ���
		 * int read()
		 * �÷�����һ�ζ�ȡһ���ַ���ʵ�ʶ�ȡ
		 * ���ֽ���Ҫ���ݶ����ַ�����������
		 * �ǵ���ȡ���ַ�����java�ж�����һ
		 * ��char��ʽ����(unicode)ռ2���ֽڡ�
		 */
		/*int d = -1;
		while ((d=isr.read())!=-1) {
			char c = (char)d;
			System.out.print(c);
		}*/
		char[] data = new char[100];
		int len = isr.read(data);
		String str = new String(data,0,len).trim();
		System.out.print(str);
		isr.close();
	}

}
