package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * java.util.Collection
 * ����
 * �������������ƣ����Ա���һ��Ԫ�أ������ṩ
 * �˲�������Ԫ�ص���ط�����ʹ�ñ�ݡ�
 * Collection�ӿ������������������ӽӿڣ�
 * java.util.List;���ظ����ϣ��������򣬿���
 * ͨ���±����Ԫ�ء�
 * 
 * java.util.Set:�����ظ����ϡ�
 * Ԫ���Ƿ��ظ�ʱ����Ԫ������equals�ȽϽ���
 * �ж��ġ�
 * @author Java
 *
 */
public class CollectionDemo1{
	public static void main(String[] args) {
		Collection c = new ArrayList();
		/**
		 * boolean add(E e)
		 * ��ǰ��������Ӹ���Ԫ�أ�����Ԫ��
		 * �ɹ�����򷵻�true��
		 */
		c.add("one");
		c.add("two");
		c.add("three");
		c.add("four");
		c.add("five");
		
		System.out.println(c);
		/**
		 * int size()
		 * ���ص�ǰ���ϵ�Ԫ�ظ���
		 */
		int size = c.size();
		System.out.println("size:"+size);
		
		boolean isEmpty = c.isEmpty();
		System.out.println("isEmpty:"+isEmpty);
		/**
		 * void clear()
		 * ��յ�ǰ����
		 */
		c.clear();
		System.out.println("���������");
		
		System.out.println(c);
		
		System.out.println("size:"+c.size());
		
		System.out.println("isEmpty:"+c.isEmpty());
	}
}
