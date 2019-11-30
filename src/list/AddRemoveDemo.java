package list;

import java.util.ArrayList;
import java.util.List;

/**
 * List提供了一对重载的add，remove方法
 * @author Java
 *
 */
public class AddRemoveDemo {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		System.out.println(list);
		/**
		 * void add(int index, E element);
		 * 将给定元素插入到指定位置
		 * 
		 * [one, 2, two, three, four, five]
		 */
		list.add(1,"2");
		System.out.println(list);
		
		String str = list.remove(2);
		System.out.println(str);
		
		
	}
}
