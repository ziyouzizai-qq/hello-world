package thread;
/**
 * 线程提供了一个静态方法：
 * static void sleep(long ms)
 * 使运行这个方法的线程阻塞指定毫秒。超时后
 * 该线程会自动回到RUNNABLE状态，等待再次并发
 * 运行。
 * @author Java
 *
 */
public class SleepDemo {
	public static void main(String[] args) {
		System.out.println("程序开始了");
		while (true) {
			System.out.println("你好！");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		//System.out.println("程序结束了");
	}
}
