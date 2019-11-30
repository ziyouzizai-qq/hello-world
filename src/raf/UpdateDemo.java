package raf;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Scanner;

/**
 * �޸��ǳ�
 * 
 * ����������Ҫ���û�����Ҫ�޸��ǳƵ��û���
 * �Լ��µ����ơ�Ȼ�󽫸��û��ǳƽ����޸Ĳ���
 * ��������û��������ڣ�����ʾ���޴��û�����
 *
 */
public class UpdateDemo {
		/**
		 * 1����ȡ�û�������û��������ǳ�
		 * 2��ʹ��RAF��user.dat�ļ�
		 * 3��ѭ����ȡ��ÿ����¼
		 *  	3.1����ָ���ƶ���������¼�û���
		 *  	     ��λ��
		 *  	3.2:��ȡ32�ֽڣ����û�����ȡ����
		 *  	3.3:�жϸ��û��Ƿ�Ϊ�û�������û�
		 *  	3.4�����Ǵ��ˣ����ƶ�ָ�뵽����
		 *  		 ��¼�ǳ�λ�ã�����ԭ�ǳ�����޸�
		 *  		 ��ֹͣѭ������
		 *  	3.5�������Ǵ���������´�ѭ��
		 * @param args
		 * @throws IOException
		 */
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("������Ҫ�޸ĵ��û�����");
		String username = sc.nextLine();
		System.out.println("������������Ҫ�޸ĵ��ǳƣ�");
		String nickname = sc.nextLine();
		byte[] bs = nickname.getBytes("UTF-8");
		bs = Arrays.copyOf(bs, 32);
		RandomAccessFile raf = new RandomAccessFile("user.dat", "rw");
		boolean isFind = false;
		for (int i = 0; i < raf.length(); i+=100) {
			raf.seek(i);
			byte[] data = new byte[32];
			raf.read(data);
			String userName = new String(data,"UTF-8").trim();
			if (userName.equals(username)) {
				isFind = true;
				raf.seek(i+32*2);
				raf.write(bs);
				System.out.println("�޸ĳɹ���");
				break;
			}
		}
		if (!isFind) {
			System.out.println("�޴���");
		}
		raf.close();
	}

}
