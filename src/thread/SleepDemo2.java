package thread;
/**
 * sleep方法要求必须处理中断异常，原因在于当
 * 一个线程调用了sleep方法处于阻塞状态的过程
 * 中若被调用了它的interrupt()方法中断时，它
 * 就会在sleep方法中抛出异常。这时并非是
 * 将这个线程直接中断，而是中断了它的阻塞状态
 * @author Java
 *
 */
public class SleepDemo2 {

	public static void main(String[] args) {
		/**
		 * JDK8之前，由于JVM内存分配问题，有一个
		 * 要求：
		 * 当一个方法的局部变量被这个方法的其他
		 * 局部内部类所引用是，这个变量声明必须
		 * 是final的。
		 */
		Thread lin = new Thread(){
			public void run(){
				System.out.println("林：刚美完容，睡会觉吧！");
				try {
					Thread.sleep(100000000);
				} catch (InterruptedException e) {
					System.out.println("林：干嘛呢！干嘛呢！都破了相了");
				}
				System.out.println("林：醒了");
				
			}
		};
		Thread huang = new Thread(){
			public void run(){
				System.out.println("黄：开始砸墙！");
				for (int i = 0; i < 5; i++) {
					System.out.println("黄：80");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {

					} 
				}
				System.out.println("哐当！");
				System.out.println("黄：搞定！");
				lin.interrupt();
			}
		};
		lin.start();
		huang.start();
	}

}
