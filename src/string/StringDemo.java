package string;
/**
 * string是不变对象，JVM对其做了一个优化，在内存
 * 中开辟了一段区域作为常量池，凡是通过“字面量”形
 * 式创建的字符串对象都会缓存并重用。因为会重用
 * 对象，所以该对象内容不变
 * @author Java
 *
 */
public class StringDemo {

	public static void main(String[] args) {
		//创建一个字符串对象s1
		String s1 = "123abc";
		//s2,s3重用，还是用s1指向的对象
		String s2 = "123abc";
		String s3 = "123abc";
		System.out.println(s1==s2);//true
		System.out.println(s1==s3);//true
		//修改内容会创建并引用新对象
		s1 = s1+"!";
		System.out.println("s1:"+s1);
		//s2,s3不受影响
		System.out.println("s2:"+s2);
		//new则一定创建对象
		String s4 = new String("123abc");
		System.out.println("s4:"+s4);
		System.out.println(s2==s4);//false
		/**
		 * 编译器有一个优化措施，当编译源代码
		 * 时发现一个计算表达式所有参数都是字面
		 * 量时，会直接进行计算，并将结果编译到
		 * class文件中。
		 * 下面代码在class文件中为：
		 * String s5 = "123abc";
		 */
		String s5 = "123"+"abc";//编译器会自动编译，相当于String s5 = "123abc";
		System.out.println("s5:"+s5);
		System.out.println(s2==s5);//true
		/**
		 * 计算表达式一方为变量，那么会在运行期
		 * 拼接，那么会创建新对象
		 */
		String s = "123";
		String s6 = s+"abc";
		System.out.println("s6:"+s6);
		System.out.println(s2==s6);//false
	}

}
