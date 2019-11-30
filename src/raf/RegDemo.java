package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 完成用户注册功能
 * 
 * 程序开始后，要求用户输入：
 * 用户名，密码，昵称，年龄
 * 
 * 将该记录写入到user.dat文件中。
 * 其中用户名，密码，昵称为字符串。年龄为
 * 一个int值。
 * 
 * 每条记录占用100字节，其中：用户名，密码，
 * 昵称为字符串，各占32字节，年龄为int占用
 * 4字节。
 * 
 * @author Java
 *
 */
public class RegDemo {

	public static void main(String[] args) throws IOException {
		System.out.println("欢迎注册");
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入用户名：");
		String username = sc.nextLine();
		
		System.out.println("请输入密码：");
		String password = sc.nextLine();
		
		System.out.println("请输入昵称：");
		String nickname = sc.nextLine();
		
		System.out.println("请输入年龄：");
		int age = Integer.parseInt(sc.nextLine());
		System.out.println(username+","+password+","+nickname+","+age);
		RandomAccessFile raf = new RandomAccessFile("user.dat","rw");
		//现将指针移动到文件末尾
		raf.seek(raf.length());
		//写用户名
		//1先将用户名转成对应的一组字节
		byte[] data = username.getBytes("UTF-8");
		//2将该数组扩容到32字节
		data = Arrays.copyOf(data, 32);
		//3将该字节数组一次性写入文件
		raf.write(data);
		//写密码
		data = password.getBytes("UTF-8");
		data = Arrays.copyOf(data, 32);
		raf.write(data);
		//写昵称
		data = nickname.getBytes("UTF-8");
		data = Arrays.copyOf(data, 32);
		raf.write(data);
		//写年龄
		raf.writeInt(age);
		System.out.println("注册完毕！");
		raf.close();
	}
}
