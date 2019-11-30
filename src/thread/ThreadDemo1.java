package thread;
/**
 * 
 * 线程是并发运行代码的
 * 有两种创建线程的方式：
 * 方式一：继承Thread并重写run方法。run方法中
 * 就是希望线程执行的逻辑。
 * @author Java
 *
 */
public class ThreadDemo1 extends Thread{
	public static void main(String[] args) {
		Thread t1 = new MyThead1();
		Thread t2 = new MyThead2();
		/**
		 * 启动线程要调用start方法。而不是
		 * 直接调用run方法。当start方法调用
		 * 完毕后，run方法很快会被线程自行调
		 * 用。
		 */
		t1.start();
		t2.start();
	}
}
/**
 * 第一种创建线程的方式比较简单直接，但是缺点
 * 主要有两个：
 * 1：出于需要继承线程，这导致不能再继承其他类
 * 	  实际开发中经常要复用某个超类的功能，那么
 * 	  在继承线程后不能再继承其他类会有很多不便
 * 
 * 2：定义线程类的同时重写run方法，这会导致
 * 	  线程与线程要执行的任务有一个必然的耦合
 * 	  关系，不利于线程的重用。
 * @author Java
 *
 */
class MyThead1 extends Thread{
	public void run() {
        for (int i = 0; i <1000; i++) {
			System.out.println("你是谁？");
		}
    }
}
class MyThead2 extends Thread{
	public void run() {
        for (int i = 0; i <1000; i++) {
			System.out.println("我是查水表的");
		}
    }
}