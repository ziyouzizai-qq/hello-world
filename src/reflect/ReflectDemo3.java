package reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * ���÷�����÷���
 * @author Java
 *
 */
public class ReflectDemo3 {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
//		Person p = new Person();
//		p.sayHello();
		/*
		 * ���÷���
		 */
		//1���������
		Scanner sc = new Scanner(System.in);
		System.out.println("������Ҫʵ�������ࣺ");
		Class cls = Class.forName(sc.nextLine());
		//2ʵ����
		Object o = cls.newInstance();
		
		/*
		 * 3ͨ��������ȡ�䶨��ķ���
		 * Method��ÿһ��ʵ�����ڱ�ʾһ�������
		 * ��һ�����巽��
		 */
		System.out.println("������Ҫִ�еķ�����");
		Method method = cls.getMethod(sc.nextLine(), null);
		/*
		 * 4���ø÷���
		 */
		method.invoke(o, null);
	}
}
