package io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 转换流
 * java.io.InputStreamReader
 * @author Java
 *
 */
public class IsrDemo {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("osw.txt");
		InputStreamReader isr = new InputStreamReader(fis,"UTF-8");
		/**
		 * 字符流的方法
		 * int read()
		 * 该方法是一次读取一个字符，实际读取
		 * 的字节量要根据定的字符集决定。但
		 * 是当读取到字符后再java中都是以一
		 * 个char形式保存(unicode)占2个字节。
		 */
		/*int d = -1;
		while ((d=isr.read())!=-1) {
			char c = (char)d;
			System.out.print(c);
		}*/
		char[] data = new char[100];
		int len = isr.read(data);
		String str = new String(data,0,len).trim();
		System.out.print(str);
		isr.close();
	}

}
