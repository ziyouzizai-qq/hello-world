package io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * �ַ���
 * java�������ն�д��λ�ֽ�����һ�ֻ��ַ�ʽ
 * �ֽ������ַ���
 * �ֽ����Ķ�д��λ���ֽڣ����ַ����Ķ�д��λ
 * ���ַ�
 * �����ַ���ֻ�ʺ϶�д�ı����ݣ�
 * 
 * java.io.Reader,java.io.Writer
 * ��������Ҳ�ǳ����࣬�������ַ���������
 * �ַ�������ĸ��࣬�涨�˶�д�ַ������
 * ������
 * 
 * ת����
 * java.io.InputStreamReader
 * java.io.InputStreamWriter
 * ������һ�Գ��õ��ַ���ʵ���࣬������������
 * �ַ����ݶ�д������ʹ�á�����������������
 * �ǳ���Ҫ��һ�����ڡ��������Ǻ���ֱ�Ӷ���
 * ��������
 * @author Java
 *
 */
public class OswDemo {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("osw.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
		String line = "cbb��sb!";
		osw.write(line);
		line = ",���Ǵ��ϣ�ɵ�ӣ�";
		osw.write(line);
		System.out.println("д����ϣ�");
		osw.close();
	}

}
