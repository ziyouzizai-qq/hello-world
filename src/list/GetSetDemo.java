package list;

import java.util.ArrayList;
import java.util.List;

/**
 * java.util.List接口
 * List继承自collection
 * List的特点：可重复，并且有序，提供了一组可以
 * 通过下标操作元素的方法。
 * 
 * 常用实现类
 * java.util.ArrayList:内部由数组实现，查询
 * 性能更好。
 * java.util.LinkedList:内部由链表实现，增删
 * 元素性能更好，尤其首尾增删元素。
 * 在对性能没有特别苛刻要求下，通常用的是
 * ArrayList即可。
 * @author Java
 *
 */
public class GetSetDemo {
	 public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		System.out.println(list);
		/**
		 * E get(int index)
		 * 获取给定下标对应的元素
		 */
		String str = list.get(1);
		System.out.println(str);
		System.out.println("==============");
		for (int i = 0; i < list.size(); i++) {
			str = list.get(i);
			System.out.println(str);
		}
		/**
		 * E set(int index, E e)
		 * 将给定元素设置，返回值为
		 * 原位置对应元素。所以set方法的意义是
		 * 替换元素操作
		 */
		String old = list.set(1, "2");
		System.out.println(list);
		System.out.println(old);
		
	}
}
