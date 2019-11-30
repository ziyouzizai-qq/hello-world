package io;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * 使用文件输入流读取文件数据
 * @author Java
 *
 */
public class FisDemo {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("fos.dat");
		//raf是可以得到长度的
		//而流是无法得到长度的
		byte[] data = new byte[200];
		int len = fis.read(data);
		System.out.println("实际长度："+len);
		String str = new String(data,0,len,"UTF-8");
		System.out.println(str);
		fis.close();
	}

}
