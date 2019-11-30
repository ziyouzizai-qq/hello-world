package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 排序字符串
 * @author Java
 *
 */
public class SortListDemo3 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("小泽老师");
		list.add("传奇");
		list.add("苍老师");
		System.out.println(list);
		/**
		 * String已经实现了Comparable接口
		 * 比较规则为按照每个字符的unicode编码
		 * 比较。
		 * 对于排序中文时，没有什么意义。
		 * 
		 * 对此，该sort方法的使用相对局限。
		 * 所以当：
		 * 排序自定义类型元素或java提供的已经实现
		 * 过Comparable接口的元素，但是比较方法不
		 * 满足我们排序需求时，都不应当使用下面的
		 * sort方法
		 */
		Collections.sort(list);
		System.out.println(list);
	}
}
