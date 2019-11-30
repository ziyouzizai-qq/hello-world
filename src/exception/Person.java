package exception;


/**
 * 使用当前类测试异常的抛出
 * @author Java
 *
 */
public class Person {
	private int age;

	public int getAge(){
		
		return age;
	}
		/**
		 * 通常一个方法中使用throw抛出一个异常时
		 * 就要在方法声明时使用throws声明该异常的的
		 * 抛出以通知调用者解决该异常。
		 * 只有抛出RuntimeException及其子类型异常
		 * 时可以不要求这样做
		 * @param age
		 * @throws Exception
		 */
	public void setAge(int age) throws IllegalAgeException {
		if (age<0||age>100) {
			throw new IllegalAgeException("年龄不合法");
		}
		this.age = age;
	}
	
}
