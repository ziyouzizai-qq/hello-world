package io;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * ��ɼ��׵ļ��±�����
 * 
 * ����������Ҫ���û������ļ�����Ȼ��Ը�
 * �ļ�����д������
 * ֮���û������ÿһ���ַ������������뵽��
 * �ļ��С�
 * ����PWʱҪ��ʹ��������ģʽ��
 * @author Java
 *
 */
public class Test {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������ļ�����");
		String filename = sc.nextLine();
		FileOutputStream fos = new FileOutputStream(filename,true);
		OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
		BufferedWriter bw = new BufferedWriter(osw);
		/**
		 * ���������ӵ��д���PrintWriterʱ
		 * ����ָ���ڶ����������ò���Ϊһ��
		 * booleanֵ�������ֵΪtrueʱ����ǰ
		 * PW�����Զ���ˢ�¹��ܡ�
		 * ����ÿ������println����д��һ���ַ���
		 * ʱ�ͻ��Զ�flush��
		 * ע�⣺print�����ǲ����Զ�flush�ġ�
		 */
		PrintWriter pw = new PrintWriter(bw,true);
		String str = "";
		while (true) {
			System.out.println("��������Ҫ��������ݣ�");
			str = sc.nextLine();
			if ("exit".equals(str)) {
				System.out.println("�������");
				break;
			}
			//pw.flush();
			pw.println(str);//println()�����Զ�flush()
			System.out.println("д����ϣ�");
		}
		pw.close();
		sc.close();
	}
	
	
}
