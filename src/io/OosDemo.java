package io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * ������
 * ������Ҳ��һ�Ը߼������ṩ�Ĺ����Ƕ�дjava
 * �е��κζ���
 * 
 * �����������
 * java.io.ObjectOutputStream
 * �����Խ�������java����ת��Ϊһ���ֽ�Ȼ��
 * ͨ�������ӵ�������Щ�ֽ�д����
 * @author Java
 *
 */
public class OosDemo {
	public static void main(String[] args) throws IOException {
		Person p = new Person();
		p.setName("cbb");
		p.setAge(22);
		p.setGender("��");
		String[] otherInfo = {"����","����","ɵ��"};
		p.setOtherInfo(otherInfo);
		System.out.println(p);
		FileOutputStream fos = new FileOutputStream("person.obj");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		/**
		 * ͨ��������д������������������
		 * �������裺
		 * 1���������Ƚ������Ķ���ת��Ϊ��һ��
		 *    �ֽڣ������ֽڰ������������
		 *    ������Ϣ���������ö���Ľṹ��Ϣ
		 *    Ȼ�������ֽ�ͨ�������ӵ���д��
		 *    
		 *    ����������Ӧ������������л�
		 *    
		 * 2�������ļ���ʱ���ļ����������ֽ�д
		 *    �뵽���ļ��С�   
		 *    
		 *    ������д����������ñ���Ĺ���
		 *    ��Ӧ��������ݳ־û�
		 */
		oos.writeObject(p);
		System.out.println("д����ϣ�");
		oos.close();
	}

}
