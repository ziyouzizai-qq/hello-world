package io;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * java.io.PrintWriter
 * �����Զ���ˢ�µĻ����ַ������
 * �����бȽϳ��õ��ַ��߼���
 * 
 * ���԰���д���ַ�����
 * @author Java
 *
 */
public class PwDemo1 {
	public static void main(String[] args) throws IOException {
		/**
		 * PW�ṩ��ר�����д�ļ��Ĺ��췽��
		 * PrintWriter(String path)
		 * PrintWriter(File file)
		 */
		PrintWriter pw = new PrintWriter("pw.txt","UTF-8");
		pw.println("��cbb��");
		pw.println("sb");
		System.out.println("д�����");
		pw.close();
	}
	
}
