package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * �����ṩ���ж��Ƿ��������Ԫ�صķ�����
 * @author Java
 *
 */
public class ContainsDemo {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add(new Point(1,2));
		c.add(new Point(3,4));
		c.add(new Point(5,6));
		c.add(new Point(7,8));
		c.add(new Point(9,0));
		/**
		 * ���ϵ�toString�����Ὣÿ��Ԫ��
		 * ��toString���ֳ�����
		 */
		System.out.println(c);
		Point p = new Point(1,2);
	 // c.add(p);
		/**
		 * contains����������Ԫ������equals�Ƚ�
		 * �Ľ���б𼯺��Ƿ������Ԫ��
		 */
		boolean contains = c.contains(p);
		System.out.println("����:"+contains);
	}
}
