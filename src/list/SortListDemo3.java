package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * �����ַ���
 * @author Java
 *
 */
public class SortListDemo3 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("С����ʦ");
		list.add("����");
		list.add("����ʦ");
		System.out.println(list);
		/**
		 * String�Ѿ�ʵ����Comparable�ӿ�
		 * �ȽϹ���Ϊ����ÿ���ַ���unicode����
		 * �Ƚϡ�
		 * ������������ʱ��û��ʲô���塣
		 * 
		 * �Դˣ���sort������ʹ����Ծ��ޡ�
		 * ���Ե���
		 * �����Զ�������Ԫ�ػ�java�ṩ���Ѿ�ʵ��
		 * ��Comparable�ӿڵ�Ԫ�أ����ǱȽϷ�����
		 * ����������������ʱ������Ӧ��ʹ�������
		 * sort����
		 */
		Collections.sort(list);
		System.out.println(list);
	}
}
