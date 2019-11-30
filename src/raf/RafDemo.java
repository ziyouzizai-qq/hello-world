package raf;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * java.io.RandomAccessFile
 * RAF是专门用来读写文件数据的API。其基于指针
 * 对文件数据进行读写操作，可以灵活的编辑文件
 * 数据内容。
 * 创建RAF时可以指定对该文件的权限，常用的有
 * 两种：
 * r：只读模式
 * rw：读写模式
 * @author Java
 *
 */
public class RafDemo {

	public static void main(String[] args) throws IOException {
		/**
		 * 对当前目录中人的raf.dat文件读写
		 * RAF支持两种常用的构造方法：
		 * RandomAccessFile(String path,String mode);
		 * RandomAccessFile(File file,String mode);
		 * 
		 * 注：相对路径中"./"是可以忽略不写的，因为
		 * 默认就是从当前目录开始。
		 * 
		 * RAF创建时含有权限的情况下，当指定的文件
		 * 不存在时会自动将其创造出来。
		 */
		RandomAccessFile raf = new RandomAccessFile("raf.dat","rw");
		/**
		 * void write(int d)
		 * 向文件中写入1字节，写的是给定int值
		 * 对应2进制的“低八位”
		 */
		raf.write(-1);
		System.out.println("写出完毕！");
		
		raf.close();
	}

}
