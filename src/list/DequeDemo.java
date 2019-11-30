package list;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 双端队列
 * java.util.Deque接口
 * Deque继承自Queue接口
 * 双端队列是指队列两端都可以做进出队操作。
 * 常用实现类：LinkedList 
 * @author Java
 *
 */
public class DequeDemo {
	public static void main(String[] args) {
		Deque<String> deque = new LinkedList<String>();
		deque.offer("one");
		deque.offer("two");
		deque.offerFirst("three");
		deque.offerLast("four");
		System.out.println(deque);
		
		String str = deque.poll();
		System.out.println(str);
		System.out.println(deque);
		
		str = deque.pollFirst();
		System.out.println(str);
		System.out.println(deque);
		
		str = deque.pollLast();
		System.out.println(str);
		System.out.println(deque);
		
		
	}
}
