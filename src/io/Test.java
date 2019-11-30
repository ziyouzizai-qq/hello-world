package io;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * 完成简易的记事本工具
 * 
 * 程序启动后，要求用户输入文件名，然后对该
 * 文件进行写操作。
 * 之后用户输入的每一行字符串都按行输入到该
 * 文件中。
 * 创建PW时要求使用流链接模式。
 * @author Java
 *
 */
public class Test {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入文件名：");
		String filename = sc.nextLine();
		FileOutputStream fos = new FileOutputStream(filename,true);
		OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
		BufferedWriter bw = new BufferedWriter(osw);
		/**
		 * 当在流链接当中创建PrintWriter时
		 * 允许指定第二个参数，该参数为一个
		 * boolean值，当这个值为true时，当前
		 * PW具有自动行刷新功能。
		 * 即：每当调用println方法写出一行字符串
		 * 时就会自动flush。
		 * 注意：print方法是不会自动flush的。
		 */
		PrintWriter pw = new PrintWriter(bw,true);
		String str = "";
		while (true) {
			System.out.println("请输入你要输入的内容：");
			str = sc.nextLine();
			if ("exit".equals(str)) {
				System.out.println("输入结束");
				break;
			}
			//pw.flush();
			pw.println(str);//println()可以自动flush()
			System.out.println("写入完毕！");
		}
		pw.close();
		sc.close();
	}
	
	
}
