package io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * java IO(input,output)���������
 * IO�����ǵĳ�������罻�����ݵķ�ʽ��
 * java�ṩ��һ��ͳһ�ı�׼�ķ�ʽ����罻��
 * ���ݡ�
 * 
 * java�������չ��ܻ���Ϊ����д�����ò�ͬ�ķ�
 * ������ʾ
 * ��������������絽����ķ������ڶ�ȡ����
 * ���������д�����ݡ�
 * 
 * java��������Ϊ�����ࣺ�ڵ�����������
 * �ڵ�����Ҳ�Ƶͼ�������ʵ�����ӳ���������Դ
 * �ġ��ܵ���������ʵ�ʰ������ݡ���дһ���ǽ�����
 * �ڵ����Ļ����Ͻ��еġ�
 * 
 * ��������Ҳ�Ƹ߼��������ܶ������ڣ���������
 * ���������ϣ�Ŀ���ǵ�����������ǰ��ʱ����Щ
 * ������ĳЩ�����������Լ����Ƕ����ݵ�
 * ������
 * 
 * ʵ��Ӧ���У��������������ɸ߼���������������
 * �ͼ�����ͨ���ͼ�����д���ݣ�ͨ���߼����Զ�д
 * �����ݽ���ĳЩ�ӹ��������һ�����ӵĶ�д
 * ������������̳�Ϊ�������ӡ�����Ҳ��ѧϰIO��
 * �������ڡ�
 * 
 * 
 * �ļ���
 * �ļ�����һ�Եͼ��������ڶ�д�ļ����͹��ܶ���
 * ������RandAccessFileһ�¡����ǵײ�Ķ�д
 * ��ʽ�б�������
 * RAF�ǻ���ָ����������д�ģ����������д�ļ�ָ��
 * λ�õ����ݡ������������ļ��������ݵı༭������
 * 
 * ����˳���д��ʽ�����Բ������������дָ��
 * λ�����ݣ��Դ�Ҳ�޷��������ļ����ݽ��б༭��
 * ������������ϸ߼��������Ը����ɵĶ�д���ݡ�
 * 
 * @author Java
 *
 */
public class FosDemo {

	public static void main(String[] args) throws IOException {
		/**
		 * ʹ���ļ�����д���ֽ�
		 * 
		 * FileOutputStream���ù��췽����
		 * FileOutputStream(String path)
		 * FileOutputStream(File file)
		 * �������ַ�ʽ����ʱ��Ĭ��Ϊ����д��
		 * ��������������ʱ���ָ��ļ��Ѵ��ڣ���
		 * �Ƚ����ļ��������������Ȼ��ͨ��
		 * ��ǰ��д����������Ϊ���ļ����ݡ�
		 * 
		 * FileOutputStream(String path,boolean append)
		 * FileOutputStream(File file,boolean append)
		 * ׷��дģʽ��������ָ�����ļ����ڣ���ô����ȫ
		 * ������ͨ������д�������ݻᱻ׷�ӵ��ļ����
		 */
		/*File file = new File("fos.dat");
		FileOutputStream fos = new FileOutputStream(file);*///���û��true��ÿ��д�붼�Ḳ��
		FileOutputStream fos = new FileOutputStream("fos.dat",true);
		String line ="����һ��ѧè��";
		byte[] data = line.getBytes("UTF-8");
		fos.write(data);
		System.out.println("д�����");
		fos.close();
	}

}
