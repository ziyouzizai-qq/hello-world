package raf;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

/**
 * ��¼
 * @author Java
 *
 */
public class enterDemo {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������û�����");
		String username = sc.nextLine();
		System.out.println("���������룺");
		String password = sc.nextLine();
		RandomAccessFile raf = new RandomAccessFile("user.dat", "rw");
		boolean isFind = false;
		for (int i = 0; i < raf.length(); i+=100) {
			raf.seek(i);
			byte[] data = new byte[32];
			raf.read(data);
			String userName = new String(data,"UTF-8").trim();
			if (userName.equals(username)) {
				isFind = true;
				raf.seek(i+32);
				raf.read(data);
				String passWord = new String(data,"UTF-8").trim();
				if (passWord.equals(password)) {
					System.out.println("��¼�ɹ���");
				}else {
					System.out.println("�������");
				}
				break;
			}
		}
		if (!isFind) {
			System.out.println("�޴���");
		}
		raf.close();
	}

}
