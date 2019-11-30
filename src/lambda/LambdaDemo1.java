package lambda;
/**
 * lambda表达式
 * lambda可以让java以函数式变成。
 * 该特征狮子jdk8之后推出的。
 * 使用la美吡达可以方便快捷创建匿名内部类。
 * 语法：
 * (参数列表)->{
 * 		方法体
 *    }
 * 使用lambda创建的匿名内部类实际所属的接口
 * 必须只能有一个方法。否则编译不通过
 * 
 * @author Java
 *
 */
public class LambdaDemo1 {
	public static void main(String[] args) {
		Runnable r1 = new Runnable() {
			public void run() {
				System.out.println("hello1");
			}
		};
		Thread t1 = new Thread(r1);
		t1.start();
		Runnable r2 = () ->{
			System.out.println("hello2");
		};
		Thread t2 = new Thread(r2);
		t2.start();
		/**
		 * 当方法中只有一句话时。方法的“{}”
		 * 可以省略
		 */
//		Runnable r3 = () ->System.out.println("hello3");
		Thread t3 = new Thread(
				() ->System.out.println("hello3")
		);
		t3.start();
			
	}
}
