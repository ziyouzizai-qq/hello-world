package io;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * 在流链接中使用PW
 * @author Java
 *
 */
public class PwDemo2 {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("pw.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
		BufferedWriter bw = new BufferedWriter(osw);
		PrintWriter pw = new PrintWriter(bw);
		pw.println("Hello!");
		System.out.println("写出完毕！");
		pw.close();
	}
}
