package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * �����ṩ��ͳһ�ı���Ԫ�ط�ʽ��������ģʽ
 * 
 * ��Ӧ������
 * Iterator iterator()
 * �÷������Ի�ȡһ������������ǰ���ϵĵ�����
 * ʵ���࣬ͨ��������Ԫ��
 * 
 * java.util.Iterator
 * �������ӿڣ��涨�˵������������ϵ���ز���
 * ��ͬ�ļ��϶�ʵ����һ�����ڱ�������Ԫ�ص�
 * ������ʵ����
 * 
 * ��������������Ԫ����ѭ�Ĺ��̣��ʣ�ȡ��ɾ
 * ����ɾ��Ԫ�ز��Ǳ�Ҫ������
 * @author Java
 *
 */
public class IteratorDemo {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("one");
		c.add("#");
		c.add("two");
		c.add("#");
		c.add("three");
		c.add("#");
		c.add("four");
		c.add("#");
		c.add("five");
		
		//��ȡ������
		Iterator it = c.iterator();
		/**
		 * boolean hasNext()
		 * �жϼ����Ƿ���Ԫ�ؿ��Ե���
		 */
		while (it.hasNext()) {
			/**
			 * E next()
			 * ����������һ��Ԫ��
			 */
			String o = (String)it.next();
			if ("#".equals(o)) {
			//	c.remove(o);
				/**
				 * ɾ������ͨ��next����ȡ��
				 * ��Ԫ��
				 */
				it.remove();
			}
			System.out.println(o);
		}
		System.out.println(c);
	}
}
