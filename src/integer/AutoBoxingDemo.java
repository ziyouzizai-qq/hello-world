package integer;
/**
 * JDK1.5版本推出了一个特性：
 * 自动拆装箱
 * 该特性是编译器认可的，当我们在基本类型和
 * 其对应的引用类型之间互相赋值是，编译器会
 * 自动补全代码在两者之间进行转换。
 * @author Java
 *
 */
public class AutoBoxingDemo {

	public static void main(String[] args) {
		/**
		 * 出发了编译器的自动拆箱特性：
		 * 编译器会补全代码，将包装类转换为
		 * 基本类型。
		 * 下面的代码会被编译器补充代码为
		 * int d = new Integer(1).intValue();
		 */
		int d = new Integer(1);
		/**
		 * 触发自动拆箱特性，编译器会补充代码
		 * Integer i = Integer.valueOf(d);
		 */
		Integer i = d;

	}

}
