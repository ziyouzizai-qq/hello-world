package collection;
/**
 * JDK5推出时，推出了一个新的特性：
 * 增强型for循环，也称为新循环，for each
 * 
 * 新循环不取代传统for循环的工作，它专门设计
 * 是用来遍历集合或数组的。
 * 
 * @author Java
 *
 */
public class NewForDemo1 {
	public static void main(String[] args) {
		String[] array = {"one","two","three","for"};
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println("===============");
		/**
		 * 新循环的语法也是编译器认可，而非虚拟机
		 * 认可。编译器会在编译源代码时将新循环
		 * 遍历数组改为传统for循环遍历的方式
		 */
		for (String str : array) {
			System.out.println(str);
		}
	}
}
