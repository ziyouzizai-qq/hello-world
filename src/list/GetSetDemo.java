package list;

import java.util.ArrayList;
import java.util.List;

/**
 * java.util.List�ӿ�
 * List�̳���collection
 * List���ص㣺���ظ������������ṩ��һ�����
 * ͨ���±����Ԫ�صķ�����
 * 
 * ����ʵ����
 * java.util.ArrayList:�ڲ�������ʵ�֣���ѯ
 * ���ܸ��á�
 * java.util.LinkedList:�ڲ�������ʵ�֣���ɾ
 * Ԫ�����ܸ��ã�������β��ɾԪ�ء�
 * �ڶ�����û���ر����Ҫ���£�ͨ���õ���
 * ArrayList���ɡ�
 * @author Java
 *
 */
public class GetSetDemo {
	 public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		System.out.println(list);
		/**
		 * E get(int index)
		 * ��ȡ�����±��Ӧ��Ԫ��
		 */
		String str = list.get(1);
		System.out.println(str);
		System.out.println("==============");
		for (int i = 0; i < list.size(); i++) {
			str = list.get(i);
			System.out.println(str);
		}
		/**
		 * E set(int index, E e)
		 * ������Ԫ�����ã�����ֵΪ
		 * ԭλ�ö�ӦԪ�ء�����set������������
		 * �滻Ԫ�ز���
		 */
		String old = list.set(1, "2");
		System.out.println(list);
		System.out.println(old);
		
	}
}
