package thread;
/**
 * 线程的优先级
 * 线程不能主动获取CPU时间片，只能被动的被
 * 线程调度器分配。
 * 调整线程的优先级可以最大程度的改善某个线程
 * 获取CPU时间片的次数。
 * 理论上线程优先级越高的线程获取CPU时间片的
 * 次数就越多。
 * @author Java
 *
 */
public class PriorityDemo {
	public static void main(String[] args) {
		Thread norm = new Thread(){
			public void run(){
				for (int i = 0; i < 10000; i++) {
					System.out.println("nor");
				}
			}
		};
		Thread max = new Thread(){
			public void run(){
				for (int i = 0; i < 10000; i++) {
					System.out.println("max");
				}
			}
		};
		Thread min = new Thread(){
			public void run(){
				for (int i = 0; i < 10000; i++) {
					System.out.println("min");
				}
			}
		};
		max.setPriority(Thread.MAX_PRIORITY);
		min.setPriority(Thread.MIN_PRIORITY);
		max.start();
		min.start();
		norm.start();
	}

}
