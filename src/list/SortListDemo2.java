package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 * �����Զ������͵�Ԫ��
 * @author Java
 *
 */
public class SortListDemo2 {
	public static void main(String[] args) {
		List<Point> list = new ArrayList<Point>();
		list.add(new Point(1,2));
		list.add(new Point(3,4));
		list.add(new Point(5,6));
		list.add(new Point(7,8));
		list.add(new Point(9,0));
		System.out.println(list);
		/**
		 * Collection��sort��������ļ���Ҫ��
		 * Ԫ�ر���ʵ��Comparable�ӿڡ�
		 * 
		 * ����������Զ�������Ԫ�أ�ǿ�ҽ���
		 * ��ʹ�����ַ�ʽ����Ϊ���sort������
		 * ���ǵĴ�����������(��Ҫ��Point����
		 * Ϊ��ʵ�ֽӿڣ�����д����)
		 * ����java API�кܶ����Ѿ�ʵ���˸ýӿڣ�
		 * �����װ�࣬string�ȣ���ô��������
		 * ��Ԫ�صļ���ʱ����ֱ�����������sort
		 */
		Collections.sort(list);
		System.out.println(list);
	}
}
