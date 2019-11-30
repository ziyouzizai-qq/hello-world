package list;

import java.util.ArrayList;
import java.util.List;

/**
 * 获取子集操作
 * List subLis(int start,int end)
 * 获取当前集合指定下标对应范围内的元素
 * @author Java
 *
 */
public class SubListDemo {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		System.out.println(list);
		List<Integer> subList = new ArrayList<Integer>();
		subList = list.subList(3, 8);
		System.out.println(subList);
		/**
		 * 将子集每个元素扩大十倍
		 */
		for (int i = 0; i < subList.size(); i++) {
			subList.set(i, subList.get(i)*10);
		}
		System.out.println(subList);
		/**
		 * 操作子集就是对原集合对应的元素的操作
		 */
		System.out.println(list);
		list.subList(2, 9).clear();
		System.out.println(list);
		
	}
}
