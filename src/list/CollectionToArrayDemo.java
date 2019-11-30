package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * ����ת��Ϊ����
 * �����ṩ��һ��������toArray�����Խ���ǰ
 * ����ת��Ϊһ�����顣
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
