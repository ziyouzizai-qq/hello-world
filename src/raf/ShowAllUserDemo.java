package raf;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 显示所有注册用户信息
 * @author Java
 *
 */
public class ShowAllUserDemo {

	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("user.dat", "r");
		/**
		 * 循环读取若干字节
		 */
		for (int i = 0; i < raf.length()/100; i++) {
			//读用户名
			//1先读取32字节
			byte[] data = new byte[32];
			raf.read(data);
			//2将字节数组转换为字符串
			String username = new String(data,"UTF-8").trim();
			//读密码
			raf.read(data);
			String password = new String(data,"UTF-8").trim();
			//读名称
			raf.read(data);
			String nickname = new String(data,"UTF-8").trim();
			//读年龄
			int age = raf.readInt();
			System.out.println(username+","+password+","+nickname+","+age);
		}
		raf.close();
	}

}
