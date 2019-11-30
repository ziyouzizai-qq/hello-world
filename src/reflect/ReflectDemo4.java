package reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * �����вη���
 * @author Java
 *
 */
public class ReflectDemo4 {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		/*
		 *Person p = new Person();
		 */
		Class cls = Class.forName("reflect.Person");
		Object o = cls.newInstance();
		
		/*
		 * p.sayHello("cbb");
		 * 
		 * 1:��ȡPerson��sayHello����
		 *   void sayHello(String)
		 */
		Method method = cls.getMethod("sayHello", String.class);
		/*
		 * 2:����o��������sayHello������
		 *   ����ʵ�ʲ���
		 */
		method.invoke(o, "cbbsb");
		
		Method method2 = cls.getMethod("sayHello", String.class,int.class);
		method2.invoke(o, "cbbsb",22);
	}
}
