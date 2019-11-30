package thread;
/**
 * 静态方法若使用synchronized修饰，那么该方法
 * 一定具有同步效果
 * 静态方法对应的同步监视器对象为当前类的
 * 类对象(class的实例)。类对象会在后面反射
 * 的课程中讲到。
 * @author Java
 *
 */
public class SyncDemo3 {
	public static void main(String[] args) {
	//	Foo f1 = new Foo();
	//	Foo f2 = new Foo();
		Thread t1 = new Thread(){
			public void run(){
				Foo.dosome();
			}
		};
		Thread t2 = new Thread(){
			public void run(){
				Foo.dosome();
			}
		};
		t1.start();
		t2.start();
	}
}
class Foo{
	public synchronized static void dosome(){
		Thread t = Thread.currentThread();
		System.out.println(t.getName()+"正在调用dosome方法");
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println(t.getName()+"调用dosome方法完毕！");
	}
}