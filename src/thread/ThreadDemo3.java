package thread;
/**
 * 线程提供了获取相关信息的方法
 * @author Java
 *
 */
public class ThreadDemo3 {
	public static void main(String[] args) {
		/**
		 * static Thread currentThread()
		 * 该方法用来获取运行这个方法的线程
		 * main方法也是靠一个线程运行的，当JVM启动
		 * 后会自动创建一个线程来执行main方法。er
		 * 这个线程的名字叫做"main"，我们称它为主线程
		 * 
		 * 获取运行main方法的线程
		 */
		Thread main = Thread.currentThread();
		System.out.println("运行main方法的线程："+main);
		dosome();
		
		Thread t = new Thread(){
			public void run(){
				Thread t = Thread.currentThread();
				System.out.println("自定义线程："+t);
				dosome();
			}
		};
		t.start();
	}
	public static void dosome(){
		Thread t = Thread.currentThread();
		System.out.println("运行main方法的线程："+t);
	}
}
