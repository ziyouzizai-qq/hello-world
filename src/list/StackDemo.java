package list;

import java.util.Deque;
import java.util.LinkedList;

/**
 * ջ�ṹ
 * ջҲ���Ա���һ��Ԫ�أ����Ǵ�ȡԪ�ر�����ѭ
 * �Ƚ����ԭ��
 * Deque˫�˶��п���ʵ��ջ������Ϊջר���ṩ
 * ������������push��pop
 * ͨ������ʹ��ջ��Ϊ��ʵ�֡����ˡ������ȹ��ܡ�
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
