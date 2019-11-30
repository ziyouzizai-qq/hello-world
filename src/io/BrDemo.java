package io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * �����ַ���������
 * java.io.BufferedReader
 * �ص㣺���԰��ж�ȡ�ַ���
 * @author Java
 *
 */
public class BrDemo {
	public static void main(String[] args) throws IOException {
		/**
		 * ����ǰԴ�������������̨
		 */
		FileInputStream fis = new FileInputStream("src/io/BrDemo.java");
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		/**
		 * String readLine()
		 * ��ȡһ���ַ���
		 * ˳���ȡ�����ַ�������ȡ���˻���
		 * ��ʱֹͣ���������з�֮ǰ���ַ���
		 * ��һ���ַ������ء����ص��ַ�����
		 * �ǲ����л��з��ġ�
		 * ������ֵΪnull��˵������ȡ����
		 * ĩβ��
		 * 
		 */
		String line = null;
		while ((line=br.readLine())!=null) {
			System.out.println(line);
		}
		br.close();
	}
}
