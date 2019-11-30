package threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 线程池
 * 线程池主要有两个作用：
 * 1：控制线程数量
 * 2：重用线程
 * @author Java
 *
 */
public class ThreadPoolDemo {
	public static void main(String[] args) {
		ExecutorService threadPool = Executors.newFixedThreadPool(2);
		for (int i = 0; i < 5; i++) {
			Runnable runn = new Runnable(){
				 public void run(){
					Thread t = Thread.currentThread();
					try {
						System.out.println(t.getName()+"正在执行任务");
						Thread.sleep(5000);
						System.out.println(t.getName()+"正在结束任务");
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			};
			//将任务指派给线程池
			threadPool.execute(runn);
			System.out.println("指派了一个任务给线程");
		}//for循环结束
		
		//停止线程池，不再接收任务。
		/*
		 *shutdown()方法调用后，线程池不再
		 *接收新任务，并且会将线程池中所有
		 *的任务执行后自动停止
		 *
		 *shutdownNow()方法调用后，线程池
		 *会强制中断所有线程立即停止
		 */
		threadPool.shutdown();
		//强制立即停止线程池
		threadPool.shutdownNow();
		System.out.println("线程池停止了");
	}
}
