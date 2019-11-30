package raf;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

/**
 * 完成简易的记事本工具 程序启动后，要求用户输入文件名，然后使用 RAF对该文件读写操作。 之后用户在控制台输入的每行字符串都写入到 该文件中
 * 当用户输入了“exit”时，程序退出
 * 
 * @author Java
 *
 */
public class Test {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入文件名：");
		String str = sc.nextLine();
		RandomAccessFile raf = new RandomAccessFile(str, "rw");
		System.out.println("请输入内容：");
		while (true) {
			sc = new Scanner(System.in);
			str = sc.nextLine();
			if ("exit".equals(str)) {
				break;
			}
			byte[] data = str.getBytes("UTF-8");
			raf.write(data);
			System.out.println("写入完毕");

		}
		raf.close();
		System.out.println("RAF关闭");
	}
}
