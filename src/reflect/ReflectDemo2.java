package reflect;

import java.lang.reflect.InvocationTargetException;

/**
 * 通过类对象快速创建实例
 * @author Java
 *
 */
public class ReflectDemo2 {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		/*
		 * 实例化Person
		 */
//		Person p = new Person();
//		System.out.println(p);
		/*
		 * 利用反射
		 */
		Object obj = obj = Class.forName("reflect.Person").getConstructor(String.class,Integer.class).newInstance("张三",12);
		/*
		 * java.util.Date
		 * java.util.ArrayList
		 * 
		 * Class有一个快速实例化对象的方法：
		 * newInstance()
		 * 但是需要注意，该Class实例表示的类必须要
		 * 包含无参构造方法，否则不能使用这种方式
		 * 实例化
		 */
		System.out.println(obj);
	}
}
