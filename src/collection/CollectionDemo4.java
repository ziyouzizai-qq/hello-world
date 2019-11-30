package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * �����ڼ��ϵ��е�Ӧ��---Լ�������е�Ԫ������
 * @author Java
 *
 */
public class CollectionDemo4 {
	public static void main(String[] args) {
		Collection<String> c = new ArrayList<String>();
		/**
		 * ָ����add����ֻ�ܴ��뷺��Ҫ���
		 */
		c.add("one");
		c.add("two");
		c.add("three");
		c.add("four");
		System.out.println(c);
		/**
		 * ��ѭ������ֱ����ʵ�����ͽ���Ԫ��
		 */
		for (String str : c) {
			System.out.println(str);
		}
		System.out.println("==============");
		/**
		 * ������Ҳ֧�ַ���
		 */
		Iterator<String> it = c.iterator();
		while (it.hasNext()) {
			String str = it.next();
			System.out.println(str);
		}
	}

}
