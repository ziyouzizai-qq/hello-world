package list;

import java.util.ArrayList;
import java.util.List;

/**
 * ��ȡ�Ӽ�����
 * List subLis(int start,int end)
 * ��ȡ��ǰ����ָ���±��Ӧ��Χ�ڵ�Ԫ��
 * @author Java
 *
 */
public class SubListDemo {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		System.out.println(list);
		List<Integer> subList = new ArrayList<Integer>();
		subList = list.subList(3, 8);
		System.out.println(subList);
		/**
		 * ���Ӽ�ÿ��Ԫ������ʮ��
		 */
		for (int i = 0; i < subList.size(); i++) {
			subList.set(i, subList.get(i)*10);
		}
		System.out.println(subList);
		/**
		 * �����Ӽ����Ƕ�ԭ���϶�Ӧ��Ԫ�صĲ���
		 */
		System.out.println(list);
		list.subList(2, 9).clear();
		System.out.println(list);
		
	}
}
