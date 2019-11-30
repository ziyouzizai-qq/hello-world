package thread;


/**
 * 线程提供了一个方法：
 * void join()
 * 该方法可以协调线程之间的同步运行
 * 
 * 同步与异步：
 * 同步运行：运行有顺序
 * 异步运行：运行代码无顺序，多线程并发运行就
 *          是异步运行
 * @author Java
 *
 */
public class JoinDemo {
	//标识图片是否下载完毕
	private static boolean isFinish = false;
	public static void main(String[] args) {
		Thread download = new Thread(){
			public void run(){
				System.out.println("down：开始下载图片。。。");
				for (int i = 0; i <= 100; i++) {
					System.out.println("down:"+i+"%");
					try {
						Thread.sleep(20);
					} catch (InterruptedException e) {
					}
				}
				System.out.println("down:下载图片完毕！");
				isFinish = true;
			}
		};
		Thread show = new Thread(){
			public void run(){
				System.out.println("show：开始显示。。。");
				//加载图片前应先等待下载线程将图片下载完毕
				try {
					/**
					 * show线程在调用download.join()方法后
					 * 就进入了阻塞状态，直到download线程
					 * 的run方法执行完毕才会解除阻塞。
					 */
					download.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				if (!isFinish) {
					throw new RuntimeException("加载图片失败");
				}
				System.out.println("show：显示图片完毕");
			}
		};
		download.start();
		show.start();
	}
}
