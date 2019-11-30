package exception;
/**
 * 测试异常的抛出
 * @author Java
 *
 */
public class ThrowDemo {

	public static void main(String[] args) {
		System.out.println("程序开始了");
		Person p = new Person();
		/**
		 * 满足语法，但是不满足业务逻辑要求
		 * 这时setAge方法中科院当做异常抛出
		 * 要求这里调用时处理
		 */
		//该归你管try-catch
		try {
			/**
			 * 当调用一个含有throws声明异常抛出
			 * 的方法时，要求必须处理该异常。
			 * 而处理方式有两种：
			 * 1：使用try-catch捕获并解决异常
			 * 2：在当前方法上继续使用throws声明
			 * 	  该异常的抛出
			 */
			p.setAge(1000);
		} catch (IllegalAgeException e) {
			e.printStackTrace();
		}
		//p.setAge(1000);
		System.out.println(p.getAge());
		System.out.println("程序结束了");
	}

}
