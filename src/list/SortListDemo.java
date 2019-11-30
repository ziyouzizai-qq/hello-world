package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * ���Ϲ����ࣺjava.util.collections
 * ���ṩ��һ����̬������sort,���Զ�List����
 * ������Ȼ���򣨴�С����
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
