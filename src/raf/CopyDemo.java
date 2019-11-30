package raf;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 复制文件操作
 * @author Java
 *
 */
public class CopyDemo {
	public static void main(String[] args) throws IOException, InterruptedException {
		/**
		 * 创建两个RAF，一个用来读原文件，
		 * 一个用来往复制文件中写。
		 * 顺序从原文件读取每一个字节写入到
		 * 复制文件中。
		 */
		RandomAccessFile src = new RandomAccessFile("image.png","r");
		
		RandomAccessFile desc = new RandomAccessFile("image_cp.png","rw");
		
		int d = -1;
		while ((d=src.read())!=-1) {
			desc.write(d);;
		}
		System.out.println("复制完毕");
		src.close();
		desc.close();
	}
}
