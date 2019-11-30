package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 泛型在集合当中的应用---约束集合中的元素类型
 * @author Java
 *
 */
public class CollectionDemo4 {
	public static void main(String[] args) {
		Collection<String> c = new ArrayList<String>();
		/**
		 * 指定后add方法只能传入泛型要求的
		 */
		c.add("one");
		c.add("two");
		c.add("three");
		c.add("four");
		System.out.println(c);
		/**
		 * 新循环可以直接用实际类型接收元素
		 */
		for (String str : c) {
			System.out.println(str);
		}
		System.out.println("==============");
		/**
		 * 迭代器也支持泛型
		 */
		Iterator<String> it = c.iterator();
		while (it.hasNext()) {
			String str = it.next();
			System.out.println(str);
		}
	}

}
