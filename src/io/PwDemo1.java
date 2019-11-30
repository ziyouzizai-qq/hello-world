package io;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * java.io.PrintWriter
 * 具有自动行刷新的缓冲字符输出流
 * 开发中比较常用的字符高级流
 * 
 * 可以按行写出字符串。
 * @author Java
 *
 */
public class PwDemo1 {
	public static void main(String[] args) throws IOException {
		/**
		 * PW提供了专门针对写文件的构造方法
		 * PrintWriter(String path)
		 * PrintWriter(File file)
		 */
		PrintWriter pw = new PrintWriter("pw.txt","UTF-8");
		pw.println("我cbb是");
		pw.println("sb");
		System.out.println("写出完毕");
		pw.close();
	}
	
}
