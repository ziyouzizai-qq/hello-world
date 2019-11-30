package io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 缓冲字符输入流：
 * java.io.BufferedReader
 * 特点：可以按行读取字符串
 * @author Java
 *
 */
public class BrDemo {
	public static void main(String[] args) throws IOException {
		/**
		 * 将当前源代码输出到控制台
		 */
		FileInputStream fis = new FileInputStream("src/io/BrDemo.java");
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		/**
		 * String readLine()
		 * 读取一行字符串
		 * 顺序读取若干字符，当读取到了换行
		 * 符时停止，并将换行符之前的字符组
		 * 成一个字符串返回。返回的字符串中
		 * 是不含有换行符的。
		 * 若返回值为null，说明流读取到了
		 * 末尾。
		 * 
		 */
		String line = null;
		while ((line=br.readLine())!=null) {
			System.out.println(line);
		}
		br.close();
	}
}
