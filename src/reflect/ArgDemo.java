package reflect;

import java.util.Arrays;

/**
 * JDK5之后推出了一个新的特性：
 * 可变参数
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
		System.out.println("方法开始");
		System.out.println(s.length);
		System.out.println(Arrays.toString(s));
		System.out.println("方法结束");
	}
}
