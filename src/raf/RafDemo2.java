package raf;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * RAF��д�����������ݣ��Լ�RAF��ָ�����
 * @author Java
 *
 */
public class RafDemo2 {

	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("raf.dat", "rw");
		long pos = raf.getFilePointer();
		//д��һ��int���ֵ���ļ���
		int max = Integer.MAX_VALUE;
		/**
		 * int���ֵ��2������ʽ��
		 *                            vvvvvvvv
		 * 01111111 11111111 11111111 11111111
		 * 
		 * max>>>24;������24λ
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
		 * ����д��4���ֽڣ���������intֵд����
		 * ��ͬ����4��write������
		 */
		raf.writeInt(max);
		System.out.println("pos:"+raf.getFilePointer());
		raf.writeLong(123L);
		System.out.println("pos:"+raf.getFilePointer());
		raf.writeDouble(123.123);
		System.out.println("pos:"+raf.getFilePointer());
		
		System.out.println("д����ϣ�");
		//д���ָ�������ļ�ĩβ
	    //�ƶ�ָ��λ��
		raf.seek(0);//�ƶ����ļ���ʼλ��
		
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
