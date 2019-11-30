package object;
/**
 * 测试Point重写的Object相关的方法
 * @author Java
 *
 */
public class TestPoint {

	public static void main(String[] args) {
		Point p = new Point(1,2);
		/**
		 * 通常我们定义的类如果需要使用到
		 * toString方法时,就应当重写这个
		 * 方法，Object提供的输出的是该对象
		 * 的句柄，没有什么实际意义
		 */
		String str = p.toString();
		System.out.println(str);
		/**
		 * System.out.println(Object obj);
		 * 该方法会将给定对象的toString方法
		 * 返回的字符串输出到控制台
		 */
		System.out.println(p);
		
		Point p2 = new Point(1,2);
		System.out.println(p==p2);//false
		/**
		 * 我们定义的类如果使用equals，就应当
		 * 重写这方法。Object提供的equals方法
		 * 本身内部就是用 "=="进行比较的，没有
		 * 实际意义。
		 * 而java.API提供的类，toString，equals
		 * 方法都妥善进行了重写。
		 */
		System.out.println(p.equals(p2));//false
	}

}
