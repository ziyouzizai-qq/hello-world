package raf;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 修改昵称
 * 
 * 程序启动后，要求用户输入要修改昵称的用户名
 * 以及新的名称。然后将该用户昵称进行修改操作
 * 若输入的用户名不存在，则提示“无此用户”。
 *
 */
public class UpdateDemo {
		/**
		 * 1：获取用户输入的用户名及新昵称
		 * 2：使用RAF打开user.dat文件
		 * 3：循环读取的每条记录
		 *  	3.1：将指针移动到该条记录用户名
		 *  	     的位置
		 *  	3.2:读取32字节，将用户名提取出来
		 *  	3.3:判断该用户是否为用户输入的用户
		 *  	3.4：若是此人，则移动指针到该条
		 *  		 记录昵称位置，覆盖原昵称完成修改
		 *  		 并停止循环操作
		 *  	3.5：若不是此人则进入下次循环
		 * @param args
		 * @throws IOException
		 */
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入要修改的用户名：");
		String username = sc.nextLine();
		System.out.println("请重新输入你要修改的昵称：");
		String nickname = sc.nextLine();
		byte[] bs = nickname.getBytes("UTF-8");
		bs = Arrays.copyOf(bs, 32);
		RandomAccessFile raf = new RandomAccessFile("user.dat", "rw");
		boolean isFind = false;
		for (int i = 0; i < raf.length(); i+=100) {
			raf.seek(i);
			byte[] data = new byte[32];
			raf.read(data);
			String userName = new String(data,"UTF-8").trim();
			if (userName.equals(username)) {
				isFind = true;
				raf.seek(i+32*2);
				raf.write(bs);
				System.out.println("修改成功！");
				break;
			}
		}
		if (!isFind) {
			System.out.println("无此人");
		}
		raf.close();
	}

}
