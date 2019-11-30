package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Collections提供了一个重载的sort方法，该
 * 方法除了要求传入要排序的集合外，还要求再
 * 传入一个比较器(Comparator)，该比较器可以
 * 定义一种比较规则，该sort方法会用这个比较
 * 规则对集合元素比较后进行排序。
 * @author Java
 *
 */
public class SortListDemo4 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("传奇");
		list.add("小泽老师");
		list.add("苍老师");
		System.out.println(list);
		/**
		 * 这种排序方法不要求集合元素必须实现Comparable
		 * 接口，对此在排序自定义元素时不对我们的代码
		 * 产生额外侵入，由于可以自定比较规则，对于像
		 * String这样已经实现类比较方法的可以做到按照
		 * 我们的比较规则排序。
		 * 开发中推荐中这种方式排序。
		 */
		Collections.sort(list, new Comparator<String>(){
			public int compare(String o1, String o2) {
				//按照字符多少比大小
				return o2.length()-o1.length();
			}
		});
		System.out.println(list);

	}
}
