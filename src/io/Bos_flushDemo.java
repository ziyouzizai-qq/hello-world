package io;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ����������Ļ���������
 * @author Java
 *
 */
public class Bos_flushDemo {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("bos.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		String str = "��cbb��sb";
		byte[] data = str.getBytes("UTF-8");
		/**
		 * ��������write��������������������д����
		 * �����Ƚ����ݴ������ڲ��������У�������
		 * װ��ʱ�Ż���һ������д��������ת��Ϊ��
		 * д�����Ĺ��̣�
		 */
		bos.write(data);
		/**
		 * flush������������ǿ�ƽ��������Ѿ������
		 * ����һ����д����������������д��������
		 * �м�ʱ�ԣ�����Ƶ�����ûή��дЧ�ʡ�
		 * �ڸ���עд���ļ�ʱ��ʱӦ��ʹ�ø÷�����
		 */
		bos.flush();
		System.out.println("д����ϣ�");
		/**
		 * close()�����л����һ��flush����
		 */
		bos.close();
	}

}
