package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * ��ϣ����߶�дЧ�ʣ�����ͨ�����ÿ��ʵ�ʶ�д
 * ��������������ʵ�ʷ����Ķ�д������������
 * ���ֽڶ�д�������д
 * һ���ֽڶ�д�����д
 * ��еӲ�̣����̣��Ŀ��дЧ�ʻ��ǱȽϺõģ�����
 * �����дЧ�ʽϲ
 * @author Java
 *
 */
public class CopyDemo2 {

	public static void main(String[] args) throws IOException {
		RandomAccessFile src = new RandomAccessFile("image.png","r");
		
		RandomAccessFile desc = new RandomAccessFile("image_cp_1.png","rw");

		/**
		 * RAF�ṩ�Ŀ��д�����ķ�����
		 * int read(byte[] data)
		 * һ���Զ�ȡ�������ֽ����鳤�ȵ��ֽ�
		 * �������뵽�������С�����ֵΪʵ��
		 * ��ȡ�����ֽ�����������ֵΪ-1����ʾ
		 * ���ζ�ȡʱ�ļ�ĩβ��û�����κ��ֽڣ�
		 * 
		 * void write(byte[] data) 
		 * һ����д���������ֽ����鳤�ȵ��ֽ�
		 * void write(byte[] data,int start,int len) 
		 * һ����д���������ֽ����鳤�ȵ��ֽ�
		 */
		//��¼ÿ��ʵ�ʶ�ȡ�����ֽ���
		int len = -1;
		//ÿ��Ҫ���ȡ���ֽ���
		//10kb
		byte[] data = new byte[1024*10];
		while ((len=src.read(data))!=-1) {
			desc.write(data,0,len);;
		}
		System.out.println("�������");
		src.close();
		desc.close();
	}

}
