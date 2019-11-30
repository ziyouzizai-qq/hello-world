package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 * 排序自定义类型的元素
 * @author Java
 *
 */
public class SortListDemo2 {
	public static void main(String[] args) {
		List<Point> list = new ArrayList<Point>();
		list.add(new Point(1,2));
		list.add(new Point(3,4));
		list.add(new Point(5,6));
		list.add(new Point(7,8));
		list.add(new Point(9,0));
		System.out.println(list);
		/**
		 * Collection的sort方法排序的集合要求
		 * 元素必须实现Comparable接口。
		 * 
		 * 如果是排序自定义类型元素，强烈建议
		 * 不使用这种方式，因为这个sort方法对
		 * 我们的代码有侵入性(它要求Point必须
		 * 为它实现接口，并重写方法)
		 * 由于java API中很多类已经实现了该接口，
		 * 比如包装类，string等，那么在排序这
		 * 样元素的集合时可以直接用下面这个sort
		 */
		Collections.sort(list);
		System.out.println(list);
	}
}
