package list;

import java.util.LinkedList;
import java.util.Queue;

/**
 * java.util.Queue
 * Queue接口继承自Collection。
 * 队列也可以保存一组元素，但是存取元素必须
 * 遵循先进先出模式。
 * 常用实现类：LinkedList
 * @author Java
 *
 */
public class QueueDemo {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		/**
		 * offer是入队操作，向队列末尾追加
		 * 元素
		 */
		queue.offer("one");
		queue.offer("two");
		queue.offer("three");
		queue.offer("four");
		
		System.out.println(queue);
		/**
		 * poll方法是出队操作
		 * 获取队首元素后该元素即从队列中
		 * 被删除
		 */
		String str = queue.poll();
		System.out.println(str);
		System.out.println(queue);
		/**
		 * peek是引用队首元素，元素不做出队
		 * 操作
		 */
		str = queue.peek();
		System.out.println(str);
		System.out.println(queue);
		/**
		 * 遍历队列
		 * 使用迭代器遍历，元素不会因此被队列
		 * 删除
		 */
		for (String s : queue) {
			System.out.println(s);
		}
		System.out.println("==============");
		/**
		 * 使用poll方法遍历队列
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
