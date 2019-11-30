package list;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 栈结构
 * 栈也可以保存一组元素，但是存取元素必须遵循
 * 先进后出原则。
 * Deque双端队列可以实现栈，并且为栈专门提供
 * 了两个方法：push，pop
 * 通常我们使用栈是为了实现“后退”这样等功能。
 * @author Java
 *
 */
public class StackDemo {
	public static void main(String[] args) {
		Deque<String> stack = new LinkedList<String>();
		
		stack.push("one");
		stack.push("two");
		stack.push("three");
		stack.push("four");
		stack.push("five");
		
		System.out.println(stack);
		
		String str = stack.pop();
		System.out.println(str);
		System.out.println(stack);
	}
}
