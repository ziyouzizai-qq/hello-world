package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * 集合转换为数组
 * 集合提供了一个方法：toArray，可以将当前
 * 集合转换为一个数组。
 * @author Java
 *
 */
public class CollectionToArrayDemo {
	public static void main(String[] args) {
		String[] a = new String[]{};
		System.out.println(a.length);
		List<String> c = new ArrayList<String>();
		c.add("one");
		c.add("two");
		c.add("three");
		c.add("four");
		c.add("five");
		//Object[] array = c.toArray();
		String[] array = c.toArray(new String[c.size()]);
//		String[] array = c.toArray(new String[]{});
		System.out.println(array.length);
		System.out.println(Arrays.toString(array));
	}
}
