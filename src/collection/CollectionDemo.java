package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * ����ֻ�ܴ����������Ԫ�أ����Ҵ�ŵ�Ҳ��Ԫ
 * �ص�����(��ַ)
 * @author Java
 *
 */
public class CollectionDemo {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		
		Point p = new Point(1,2);
		
		c.add(p);
		System.out.println("c:"+c);
		System.out.println("p:"+p);
		
		p.setX(2);
		System.out.println("c:"+c);
		System.out.println("p:"+p);
	}
}
