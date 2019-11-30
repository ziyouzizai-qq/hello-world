package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * ���ϲ���
 * @author Java
 *
 */
public class CollectionDemo3 {
	public static void main(String[] args) {
		Collection c1 = new ArrayList();
		c1.add("java");
		c1.add("c");
		c1.add("c++");
		c1.add("php");
		
		Collection c2 = new HashSet();
		c2.add("net");
		c2.add("c");
		c2.add("c++");
		
		c1.addAll(c2);
		System.out.println("c1:"+c1);
		/**
		 * boolean addAll(Collection c)
		 * �����������е�����Ԫ����ӵ�
		 * ��ǰ�����С�
		 */
		c2.addAll(c1);
		System.out.println("c2:"+c2);
		
		Collection c3 = new ArrayList();
		c3.add("c");
		c3.add("net");
		System.out.println("c3:"+c3);
		/**
		 * boolean comtainsAll(Collection c)
		 * �жϵ�ǰ�����Ƿ�������������е�
		 * ����Ԫ��
		 */
		boolean ca = c2.containsAll(c3);
		System.out.println("ȫ����:"+ca);
		/**
		 * ɾ����ǰ������������ϵĹ���Ԫ��
		 */
		c2.removeAll(c3);
		System.out.println("c2:"+c2);
	}
}
