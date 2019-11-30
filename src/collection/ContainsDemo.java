package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 集合提供了判断是否包含给定元素的方法；
 * @author Java
 *
 */
public class ContainsDemo {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add(new Point(1,2));
		c.add(new Point(3,4));
		c.add(new Point(5,6));
		c.add(new Point(7,8));
		c.add(new Point(9,0));
		/**
		 * 集合的toString方法会将每个元素
		 * 的toString体现出来。
		 */
		System.out.println(c);
		Point p = new Point(1,2);
	 // c.add(p);
		/**
		 * contains方法是依靠元素自身equals比较
		 * 的结果判别集合是否包含该元素
		 */
		boolean contains = c.contains(p);
		System.out.println("包含:"+contains);
	}
}
