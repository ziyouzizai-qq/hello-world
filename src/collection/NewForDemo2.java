package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 使用新循环遍历集合
 * @author Java
 *
 */
public class NewForDemo2 {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("one");
		c.add("two");
		c.add("three");
		c.add("four");
		c.add("five");
		System.out.println(c);
		/**
		 * 新循环遍历集合会被编译器改为使用
		 * 迭代器遍历。所以在便利的过程中是
		 * 不能通过集合的方法增删元素的。
		 */
		for (Object o : c) {
			String str = (String)o;
			System.out.println(str);
		}
	}
}
