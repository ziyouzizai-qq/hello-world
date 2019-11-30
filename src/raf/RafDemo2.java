package raf;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * RAF读写基本类型数据，以及RAF的指针操作
 * @author Java
 *
 */
public class RafDemo2 {

	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("raf.dat", "rw");
		long pos = raf.getFilePointer();
		//写入一个int最大值到文件中
		int max = Integer.MAX_VALUE;
		/**
		 * int最大值的2进制形式：
		 *                            vvvvvvvv
		 * 01111111 11111111 11111111 11111111
		 * 
		 * max>>>24;向右移24位
		 */
		raf.write(max>>>24);
		System.out.println("pos:"+raf.getFilePointer());
		raf.write(max>>>16);
		System.out.println("pos:"+raf.getFilePointer());
		raf.write(max>>>8);
		System.out.println("pos:"+raf.getFilePointer());
		raf.write(max);
		System.out.println("pos:"+raf.getFilePointer());
		/**
		 * void writeInt(int d)
		 * 连续写出4个字节，将给定的int值写出。
		 * 等同上面4次write方法。
		 */
		raf.writeInt(max);
		System.out.println("pos:"+raf.getFilePointer());
		raf.writeLong(123L);
		System.out.println("pos:"+raf.getFilePointer());
		raf.writeDouble(123.123);
		System.out.println("pos:"+raf.getFilePointer());
		
		System.out.println("写入完毕！");
		//写完后指针现在文件末尾
	    //移动指针位置
		raf.seek(0);//移动到文件开始位置
		
		int d = raf.readInt();
		System.out.println("pos:"+raf.getFilePointer());
		System.out.println(d);
		
		raf.seek(8);
		long d1 = raf.readLong();
		System.out.println("pos:"+raf.getFilePointer());
		System.out.println(d1);
		
		raf.seek(16);
		double d2 = raf.readDouble();
		System.out.println("pos:"+raf.getFilePointer());
		System.out.println(d2);
		
		raf.close();
	}

}
