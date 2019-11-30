package raf;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * java.io.RandomAccessFile
 * RAF��ר��������д�ļ����ݵ�API�������ָ��
 * ���ļ����ݽ��ж�д�������������ı༭�ļ�
 * �������ݡ�
 * ����RAFʱ����ָ���Ը��ļ���Ȩ�ޣ����õ���
 * ���֣�
 * r��ֻ��ģʽ
 * rw����дģʽ
 * @author Java
 *
 */
public class RafDemo {

	public static void main(String[] args) throws IOException {
		/**
		 * �Ե�ǰĿ¼���˵�raf.dat�ļ���д
		 * RAF֧�����ֳ��õĹ��췽����
		 * RandomAccessFile(String path,String mode);
		 * RandomAccessFile(File file,String mode);
		 * 
		 * ע�����·����"./"�ǿ��Ժ��Բ�д�ģ���Ϊ
		 * Ĭ�Ͼ��Ǵӵ�ǰĿ¼��ʼ��
		 * 
		 * RAF����ʱ����Ȩ�޵�����£���ָ�����ļ�
		 * ������ʱ���Զ����䴴�������
		 */
		RandomAccessFile raf = new RandomAccessFile("raf.dat","rw");
		/**
		 * void write(int d)
		 * ���ļ���д��1�ֽڣ�д���Ǹ���intֵ
		 * ��Ӧ2���Ƶġ��Ͱ�λ��
		 */
		raf.write(-1);
		System.out.println("д����ϣ�");
		
		raf.close();
	}

}
