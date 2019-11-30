package integer;
/**
 * 包装类
 * 包装类是为了解决基本类型不能直接参与面向
 * 对象开发的问题。
 * 其中6个数字类型的包装类集成自Number类。
 * java.lang.Number是一个抽象类，定义了几个
 * 抽象方法，要求数字类型的包装类可以将其表示
 * 的数字一任意数字类型返回。
 * @author Java
 *
 */
public class IntegerDemo {

	public static void main(String[] args) {
		int d = 128;
		//转换为包装类
	//	Integer i1 = new Integer(d);
	//	Integer i2 = new Integer(d);
		//推荐用valueOf转换为包装类
		Integer i1 = Integer.valueOf(d);
		Integer i2 = Integer.valueOf(d);
		
		System.out.println(i1==i2);
		System.out.println(i1.equals(i2));
		
		/**
		 * 包装类转换为基本类型
		 */
		d = i1.intValue();
		System.out.println(d);
		
		double d1 = i1.doubleValue();
		System.out.println(d1);
		
		byte d2 = i1.byteValue();//溢出
		System.out.println(d2);
		
		/**
		 * 数字类型的包装类都定义了两个常量
		 * MAX_VALUE
		 * MIN_VALUE
		 * 用于表示该包装类对应的基本类型的
		 * 取值范围
		 */
		int imax = Integer.MAX_VALUE;
		System.out.println(imax);
		int imin = Integer.MIN_VALUE;
		System.out.println(imin);
		
		float fmax = Float.MAX_VALUE;
		System.out.println(fmax);
		float fmin = Float.MIN_VALUE;
		System.out.println(fmax);
	}

}
