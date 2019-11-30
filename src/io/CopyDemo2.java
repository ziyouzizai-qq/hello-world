package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 缓冲流
 * 缓冲流是一种高级流，功能是提高读写效率。
 * 链接它们以后，无论我们进行随机读写还是
 * 块读写，当经过缓冲流时都会被转换为块读写
 * 操作。
 * java.io.BufferedInputStream
 * java.io.BufferedOutputStream
 * @author Java
 *
 */
public class CopyDemo2 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("image.png");
		FileOutputStream fos = new FileOutputStream("image_copy.png");
		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		int d = -1;
		long start = System.currentTimeMillis();
		while ((d = bis.read())!=-1) {
			bos.write(d);
		}
		long end = System.currentTimeMillis();
		System.out.println("复制成功！耗时："+(end-start)+"ms");
		bis.close();
		bos.close();

	}

}
