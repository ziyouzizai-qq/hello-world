package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 集合只能存放引用类型元素，并且存放的也是元
 * 素的引用(地址)
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
