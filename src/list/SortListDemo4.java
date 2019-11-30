package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Collections�ṩ��һ�����ص�sort��������
 * ��������Ҫ����Ҫ����ļ����⣬��Ҫ����
 * ����һ���Ƚ���(Comparator)���ñȽ�������
 * ����һ�ֱȽϹ��򣬸�sort������������Ƚ�
 * ����Լ���Ԫ�رȽϺ��������
 * @author Java
 *
 */
public class SortListDemo4 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("����");
		list.add("С����ʦ");
		list.add("����ʦ");
		System.out.println(list);
		/**
		 * �������򷽷���Ҫ�󼯺�Ԫ�ر���ʵ��Comparable
		 * �ӿڣ��Դ��������Զ���Ԫ��ʱ�������ǵĴ���
		 * �����������룬���ڿ����Զ��ȽϹ��򣬶�����
		 * String�����Ѿ�ʵ����ȽϷ����Ŀ�����������
		 * ���ǵıȽϹ�������
		 * �������Ƽ������ַ�ʽ����
		 */
		Collections.sort(list, new Comparator<String>(){
			public int compare(String o1, String o2) {
				//�����ַ����ٱȴ�С
				return o2.length()-o1.length();
			}
		});
		System.out.println(list);

	}
}
