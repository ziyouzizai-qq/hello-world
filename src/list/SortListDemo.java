package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * 集合工具类：java.util.collections
 * 其提供了一个静态方法：sort,可以对List集合
 * 进行自然排序（从小到大）
 * @author Java
 *
 */
public class SortListDemo {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		Random rand = new Random();
		for (int i = 0; i < 10; i++) {
			list.add(rand.nextInt(100));
		}
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);

	}
}
