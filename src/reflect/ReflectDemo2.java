package reflect;

import java.lang.reflect.InvocationTargetException;

/**
 * ͨ���������ٴ���ʵ��
 * @author Java
 *
 */
public class ReflectDemo2 {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		/*
		 * ʵ����Person
		 */
//		Person p = new Person();
//		System.out.println(p);
		/*
		 * ���÷���
		 */
		Object obj = obj = Class.forName("reflect.Person").getConstructor(String.class,Integer.class).newInstance("����",12);
		/*
		 * java.util.Date
		 * java.util.ArrayList
		 * 
		 * Class��һ������ʵ��������ķ�����
		 * newInstance()
		 * ������Ҫע�⣬��Classʵ����ʾ�������Ҫ
		 * �����޲ι��췽����������ʹ�����ַ�ʽ
		 * ʵ����
		 */
		System.out.println(obj);
	}
}
