package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * ɾ������Ԫ��
 * @author Java
 *
 */
public class RemoveDemo {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add(new Point(1,2));
		c.add(new Point(3,4));
		c.add(new Point(5,6));
		c.add(new Point(7,8));
		c.add(new Point(9,0));
		System.out.println(c);
		
		Point p = new Point(1,2);
		/**
		 * ɾ��Ԫ��Ҳ������Ԫ��equals�Ƚ��ж�
		 */
		c.remove(p);
		System.out.println(c);
	}
}
