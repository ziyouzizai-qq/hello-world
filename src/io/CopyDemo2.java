package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ������
 * ��������һ�ָ߼�������������߶�дЧ�ʡ�
 * ���������Ժ��������ǽ��������д����
 * ���д��������������ʱ���ᱻת��Ϊ���д
 * ������
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
		System.out.println("���Ƴɹ�����ʱ��"+(end-start)+"ms");
		bis.close();
		bos.close();

	}

}
