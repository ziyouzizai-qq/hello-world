package list;

import java.util.LinkedList;
import java.util.Queue;

/**
 * java.util.Queue
 * Queue�ӿڼ̳���Collection��
 * ����Ҳ���Ա���һ��Ԫ�أ����Ǵ�ȡԪ�ر���
 * ��ѭ�Ƚ��ȳ�ģʽ��
 * ����ʵ���ࣺLinkedList
 * @author Java
 *
 */
public class QueueDemo {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		/**
		 * offer����Ӳ����������ĩβ׷��
		 * Ԫ��
		 */
		queue.offer("one");
		queue.offer("two");
		queue.offer("three");
		queue.offer("four");
		
		System.out.println(queue);
		/**
		 * poll�����ǳ��Ӳ���
		 * ��ȡ����Ԫ�غ��Ԫ�ؼ��Ӷ�����
		 * ��ɾ��
		 */
		String str = queue.poll();
		System.out.println(str);
		System.out.println(queue);
		/**
		 * peek�����ö���Ԫ�أ�Ԫ�ز�������
		 * ����
		 */
		str = queue.peek();
		System.out.println(str);
		System.out.println(queue);
		/**
		 * ��������
		 * ʹ�õ�����������Ԫ�ز�����˱�����
		 * ɾ��
		 */
		for (String s : queue) {
			System.out.println(s);
		}
		System.out.println("==============");
		/**
		 * ʹ��poll������������
		 */
		/*for (int i = 0; i < queue.size()+i; i++) {
			str = queue.poll();
			System.out.println(str);
		}*/
		while (queue.size()>0) {
			str = queue.poll();
			System.out.println(str);
		}
		System.out.println(queue);
	} 
}
