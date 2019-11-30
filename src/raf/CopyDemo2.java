package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 若希望提高读写效率，可以通过提高每次实际读写
 * 的数据量，减少实际发生的读写操作来做到。
 * 单字节读写：随机读写
 * 一组字节读写：块读写
 * 机械硬盘（磁盘）的块读写效率还是比较好的，但是
 * 随机读写效率较差。
 * @author Java
 *
 */
public class CopyDemo2 {

	public static void main(String[] args) throws IOException {
		RandomAccessFile src = new RandomAccessFile("image.png","r");
		
		RandomAccessFile desc = new RandomAccessFile("image_cp_1.png","rw");

		/**
		 * RAF提供的块读写操作的方法：
		 * int read(byte[] data)
		 * 一次性读取给定的字节数组长度的字节
		 * 量并存入到该数组中。返回值为实际
		 * 读取到的字节量，若返回值为-1，表示
		 * 本次读取时文件末尾（没读到任何字节）
		 * 
		 * void write(byte[] data) 
		 * 一次性写出给定的字节数组长度的字节
		 * void write(byte[] data,int start,int len) 
		 * 一次性写出给定的字节数组长度的字节
		 */
		//记录每次实际读取到的字节量
		int len = -1;
		//每次要求读取的字节量
		//10kb
		byte[] data = new byte[1024*10];
		while ((len=src.read(data))!=-1) {
			desc.write(data,0,len);;
		}
		System.out.println("复制完毕");
		src.close();
		desc.close();
	}

}
