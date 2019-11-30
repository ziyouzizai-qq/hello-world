package thread;
/**
 * 同步块
 * 语法：
 * synchronized(同步监视器对象){
 * 		需要同步运行的代码片段
 * }
 * 
 * 同步块可以更精确的控制需要同步运行的代码
 * 片段。有效的缩小同步范围可以在保证并发安全
 * 的前提下提高代码并发运行的效率
 * 使用同步块控制多线程同步运行必须要求这些
 * 线程看到的同步监视器对象为[同一个]。
 * @author Java
 *
 */
public class SyncDemo2 {
	public static void main(String[] args) {
		Shop shop = new Shop();
		Thread t1 = new Thread(){
			public void run(){
				shop.buy();
			}
		};
		Thread t2 = new Thread(){
			public void run(){
				shop.buy();
			}
		};
		t1.start();
		t2.start();
	}
}
class Shop{
	//public synchronized void buy(){
	public  void buy(){
		try {
			Thread t = Thread.currentThread();
			System.out.println(t.getName()+"：正在挑衣服。。。");
			Thread.sleep(5000);
			synchronized (this) {
				System.out.println(t.getName() + "：正在试衣服。。。");
				Thread.sleep(5000);
			}
			System.out.println(t.getName()+"结账离开");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
