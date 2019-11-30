package raf;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

/**
 * 登录
 * @author Java
 *
 */
public class enterDemo {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入用户名：");
		String username = sc.nextLine();
		System.out.println("请输入密码：");
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
					System.out.println("登录成功！");
				}else {
					System.out.println("密码错误");
				}
				break;
			}
		}
		if (!isFind) {
			System.out.println("无此人");
		}
		raf.close();
	}

}
