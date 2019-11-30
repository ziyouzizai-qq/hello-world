package raf;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 读取文件数据
 * @author Java
 *
 */
public class ReadDemo {

	public static void main(String[] args) throws IOException {
		/**
		 * 读取当前目录中raf.dat文件内容
		 */
		RandomAccessFile raf = new RandomAccessFile("raf.dat","r");
		/**
		 * int read()
		 * 只读取一个字节（*），并以int形式返回
		 * 若返回值-1则表示读取到了文件末尾
		 */
		int d = raf.read();
		System.out.println(d);
		d = raf.read();
		System.out.println(d);
		raf.close();
	}

}
