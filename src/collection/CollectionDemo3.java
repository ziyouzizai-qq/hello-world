package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * 集合操作
 * @author Java
 *
 */
public class CollectionDemo3 {
	public static void main(String[] args) {
		Collection c1 = new ArrayList();
		c1.add("java");
		c1.add("c");
		c1.add("c++");
		c1.add("php");
		
		Collection c2 = new HashSet();
		c2.add("net");
		c2.add("c");
		c2.add("c++");
		
		c1.addAll(c2);
		System.out.println("c1:"+c1);
		/**
		 * boolean addAll(Collection c)
		 * 将给定集合中的所有元素添加到
		 * 当前集合中。
		 */
		c2.addAll(c1);
		System.out.println("c2:"+c2);
		
		Collection c3 = new ArrayList();
		c3.add("c");
		c3.add("net");
		System.out.println("c3:"+c3);
		/**
		 * boolean comtainsAll(Collection c)
		 * 判断当前集合是否包含给定集合中的
		 * 所有元素
		 */
		boolean ca = c2.containsAll(c3);
		System.out.println("全包含:"+ca);
		/**
		 * 删除当前集合与给定集合的共有元素
		 */
		c2.removeAll(c3);
		System.out.println("c2:"+c2);
	}
}
