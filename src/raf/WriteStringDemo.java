package raf;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 写出字符串操作
 * @author Java
 *
 */
public class WriteStringDemo {

	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("raf.txt", "rw");
		String line = "大家好，我是阿涛！";
		/**
		 * String 提供了转换二进制的方法
		 * byte[] getBytes()
		 * 
		 * byte[] data = line.getBytes();
		 */
		//可以指定字符集进行转换(推荐这样的用法)
		byte[] data = line.getBytes("UTF-8");
		raf.write(data);
		System.out.println("写出完毕");
		raf.close();
	}

}
