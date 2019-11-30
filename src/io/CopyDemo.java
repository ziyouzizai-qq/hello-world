package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 使用文件流完成复制文件操作
 * @author Java
 *
 */
public class CopyDemo {

	public static void main(String[] args) throws IOException {
		/**
		 * 使用文件输入流读取原文件
		 * 使用文件输出流向复制文件写数据
		 * 
		 * 利用块读写操作顺序从原文件将数据
		 * 读取出来写入复制文件完成复制操作。
		 */
		FileInputStream fis = new FileInputStream("image.png");
		FileOutputStream fos = new FileOutputStream("image_copy.png");
		/*byte[] data = new byte[25000];
		//int len = fis.read(data);
		fis.read(data);
		System.out.println("读取成功！");
		//String str = new String(data,0,len,"UTF-8");
		//data = str.getBytes("UTF-8");
		fos.write(data);
		System.out.println("复制成功！");*/
		int len = -1;
		byte[] data = new byte[1024*10];
		while ((len = fis.read(data))!=-1) {
			fos.write(data,0,len);
		}
		System.out.println("复制成功！");
		fis.close();
		fos.close();
	}

}
