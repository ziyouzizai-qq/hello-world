package raf;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

/**
 * ��ɼ��׵ļ��±����� ����������Ҫ���û������ļ�����Ȼ��ʹ�� RAF�Ը��ļ���д������ ֮���û��ڿ���̨�����ÿ���ַ�����д�뵽 ���ļ���
 * ���û������ˡ�exit��ʱ�������˳�
 * 
 * @author Java
 *
 */
public class Test {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������ļ�����");
		String str = sc.nextLine();
		RandomAccessFile raf = new RandomAccessFile(str, "rw");
		System.out.println("���������ݣ�");
		while (true) {
			sc = new Scanner(System.in);
			str = sc.nextLine();
			if ("exit".equals(str)) {
				break;
			}
			byte[] data = str.getBytes("UTF-8");
			raf.write(data);
			System.out.println("д�����");

		}
		raf.close();
		System.out.println("RAF�ر�");
	}
}
