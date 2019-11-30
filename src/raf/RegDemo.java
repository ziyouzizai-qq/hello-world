package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Scanner;

/**
 * ����û�ע�Ṧ��
 * 
 * ����ʼ��Ҫ���û����룺
 * �û��������룬�ǳƣ�����
 * 
 * ���ü�¼д�뵽user.dat�ļ��С�
 * �����û��������룬�ǳ�Ϊ�ַ���������Ϊ
 * һ��intֵ��
 * 
 * ÿ����¼ռ��100�ֽڣ����У��û��������룬
 * �ǳ�Ϊ�ַ�������ռ32�ֽڣ�����Ϊintռ��
 * 4�ֽڡ�
 * 
 * @author Java
 *
 */
public class RegDemo {

	public static void main(String[] args) throws IOException {
		System.out.println("��ӭע��");
		Scanner sc = new Scanner(System.in);
		System.out.println("�������û�����");
		String username = sc.nextLine();
		
		System.out.println("���������룺");
		String password = sc.nextLine();
		
		System.out.println("�������ǳƣ�");
		String nickname = sc.nextLine();
		
		System.out.println("���������䣺");
		int age = Integer.parseInt(sc.nextLine());
		System.out.println(username+","+password+","+nickname+","+age);
		RandomAccessFile raf = new RandomAccessFile("user.dat","rw");
		//�ֽ�ָ���ƶ����ļ�ĩβ
		raf.seek(raf.length());
		//д�û���
		//1�Ƚ��û���ת�ɶ�Ӧ��һ���ֽ�
		byte[] data = username.getBytes("UTF-8");
		//2�����������ݵ�32�ֽ�
		data = Arrays.copyOf(data, 32);
		//3�����ֽ�����һ����д���ļ�
		raf.write(data);
		//д����
		data = password.getBytes("UTF-8");
		data = Arrays.copyOf(data, 32);
		raf.write(data);
		//д�ǳ�
		data = nickname.getBytes("UTF-8");
		data = Arrays.copyOf(data, 32);
		raf.write(data);
		//д����
		raf.writeInt(age);
		System.out.println("ע����ϣ�");
		raf.close();
	}
}
