package reflect;

import java.util.Arrays;

/**
 * JDK5֮���Ƴ���һ���µ����ԣ�
 * �ɱ����
 * @author Java
 *
 */
public class ArgDemo {
	public static void main(String[] args) {
		dosome("a");
		dosome("a","b");
		dosome("a","b","c");
		dosome(2,"a","b","c");
	}
	public static void dosome(int a,String... s){
		
	}
	public static void dosome(String... s){
		System.out.println("������ʼ");
		System.out.println(s.length);
		System.out.println(Arrays.toString(s));
		System.out.println("��������");
	}
}
