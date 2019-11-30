package reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * 利用反射调用方法
 * @author Java
 *
 */
public class ReflectDemo3 {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
//		Person p = new Person();
//		p.sayHello();
		/*
		 * 利用反射
		 */
		//1加载类对象
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入要实例化的类：");
		Class cls = Class.forName(sc.nextLine());
		//2实例化
		Object o = cls.newInstance();
		
		/*
		 * 3通过类对象获取其定义的方法
		 * Method的每一个实例用于表示一个类的中
		 * 的一个具体方法
		 */
		System.out.println("请输入要执行的方法：");
		Method method = cls.getMethod(sc.nextLine(), null);
		/*
		 * 4调用该方法
		 */
		method.invoke(o, null);
	}
}
