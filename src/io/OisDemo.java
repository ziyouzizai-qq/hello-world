package io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * ����������
 * ���Խ��ж���ķ����л�������
 * 
 * ʹ�ö�������ȡ���ֽڱ�����ͨ�����������
 * ���л���һ���ֽڲſ��ԡ�
 * @author Java
 *
 */
public class OisDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("person.obj");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Person p = (Person)ois.readObject();
		System.out.println(p);
		ois.close();
	}

}
