package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * �������̰߳�ȫ��ʵ�֡����ǿ��Խ���Collections
 * �����еļ���ת��Ϊһ���̰߳�ȫ�ġ�
 * @author Java
 *
 */
public class SyncDemo {
	public static void main(String[] args) {
		/**
		 * List�г��õ�ʵ����
		 * ArrayList��LinkedList���Ƕ�����
		 * �̰߳�ȫ�ġ�
		 */
		List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		System.out.println(list);
		/**
		 * �������ļ���ת��Ϊһ���̰߳�ȫ��
		 */
		list = Collections.synchronizedList(list);
		System.out.println(list);
		Set<String> set = new HashSet<String>(list);
		set = Collections.synchronizedSet(set);
		System.out.println(set);
		
		/**
		 * �ĵ�����˵��һ�����飺
		 * ��ʹ��һ���̰߳�ȫ�ļ��ϣ���Ҳ����
		 * ���������������⣬�����������Ҫ����
		 * ά����
		 */
		
		
		/**
		 * ����Ҳ�в�����ȫ��ʵ��
		 * ��������
		 * BlockingQueue,BlockingDeque
		 * ���������ڲ�ʹ��˫����ʵ�֣��ڱ�֤
		 * ������ȫ��ǰ���½���˴�ȡ��������
		 * ���Բ���Ч�ʸ���
		 */
		BlockingQueue<String> queue = new LinkedBlockingQueue<String>();
		queue.offer("one");
		try {
			queue.offer("two", 500, TimeUnit.MILLISECONDS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
