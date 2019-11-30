package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 读取字符串
 * @author Java
 *
 */
public class ReadStringDemo {

	public static void main(String[] args) throws IOException {
		/**
		 * 将raf.txt文件中的字符读取出来
		 */
		RandomAccessFile raf = new RandomAccessFile("raf.txt", "r");
		byte[] data = new byte[(int)raf.length()];
		raf.read(data);
		String str = new String(data,"UTF-8");
		System.out.println(str);
		raf.close();
	}

}
