package reflect;

import java.lang.reflect.Method;

/**
 * java的反射机制
 * 反射机制可以允许我们实例化一个类，调用方法
 * 操作属性从编码期改为在运行期决定。并且与可
 * 以在运行期间动态的得知一个类的情况(它有哪些
 * 方法，属性等)
 * 反射机制可以大大提高代码的灵活度，但是实际
 * 开发中使用要适度。过度使用反射会降低代码的
 * 运行效率
 * @author Java
 *
 */
public class ReflectDemo1 {
	public static void main(String[] args) throws ClassNotFoundException {
		/*
		 * 反射的第一步：获取要操作的类的类对象
		 * 
		 * java中每个被JVM加载的类在JVM内部都
		 * 有且只有一个类对象(class的实例)与之
		 * 对应。
		 * 通过某个类的类对象可以得知这个类的
		 * 信息(有哪些方法，哪些属性等等信息)
		 * 并且可以进行实例化等操作。
		 * 
		 * 想获取一个类的类对象的方式：
		 * 1：类名.class
		 *    每个类都有一个静态属性：class，
		 *    可以直接获取这个类的类对象。
		 *    当我们明确需要获取某个类的类对象
		 *    时可以使用这种方式。
		 *    
		 * 2：通过Class的静态方法：forName，
		 *    这种方式我们可以指定想加载的类
		 *    的名字来获取该类的类对象
		 *    
		 * 3：通过类加载器ClassLoader
		 */
		
		//查看Person类的信息
		/*
		 * 1：先获取Person的类对象
		 */
//		Class cls = Person.class;
		/*
		 * Class.forName(String className)
		 * 这里在加载一个类时指定的字符串为加载类的
		 * 完全限定名：包名.类名
		 */
		Class cls = Class.forName("reflect.Person");
		String name = cls.getName();
		System.out.println(name);
		
		Method[] methods = cls.getMethods();
		for (Method method : methods) {
			System.out.println(method.getName());
		}
	}
}
