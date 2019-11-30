package thread;
/**
 * 互斥锁
 * 当多个代码片段被synchronized块修饰后，这些
 * 同步块的同步监听器对象有是同一个时，这些
 * 代码片段就是互斥的。多个线程不能同时在这些
 * 方法中运行。
 * @author Java
 *
 */
public class SyncDemo4 {

	public static void main(String[] args) {
		Boo boo = new Boo();
		Thread t1 = new Thread(){
			public void run(){
				boo.methodA();
			}
		};
		Thread t2 = new Thread(){
			public void run(){
				boo.methodB();
			}
		};
		t1.start();
		t2.start();
	}

}
class Boo{
	public synchronized void methodA(){
		Thread t = Thread.currentThread();
		try {
			System.out.println(t.getName()+"正在执行A方法");
			Thread.sleep(5000);
			System.out.println(t.getName()+"执行A方法完毕");
			
		} catch (Exception e) {
			
		}
	}
	public synchronized void methodB(){
		Thread t = Thread.currentThread();
		try {
			System.out.println(t.getName()+"正在执行B方法");
			Thread.sleep(5000);
			System.out.println(t.getName()+"执行B方法完毕");
			
		} catch (Exception e) {
			
		}
	}
}