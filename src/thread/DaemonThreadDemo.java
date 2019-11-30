package thread;
/**
 * 守护线程
 * 守护线程又称为后台线程，默认创建的线程都
 * 是普通线程或称为前台线程，线程提供了一个
 * 方法：
 * void setDaemon(boolean on)
 * 只有调用该方法并传入参数true时，该线程才
 * 会被设置为守护线程。
 * 
 * 守护线程在使用上与普通线程没有差别，但是在
 * 结束时机上有一个区别，即：线程结束时所有正在
 * 运行的守护线程都会被强制停止。
 * 
 * 线程的结束：当一个进程中所有的普通线程都结束
 * 时，进程即结束。
 * 
 * @author Java
 *
 */
public class DaemonThreadDemo {
	public static void main(String[] args) {
		Thread rose = new Thread(){
			public void run(){
				for (int i = 0; i < 5; i++) {
					System.out.println("rose:let me go!");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("rose:啊啊啊啊啊啊啊啊啊啊aaa。。。");
				System.out.println("噗通！");
			}
		};
		Thread jack = new Thread() {
			public void run() {
				while (true) {
					System.out.println("jack:you jump,i jump");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		rose.start();
		/**
		 * 设置为守护线程
		 * 注意：必须在线程启动之前进行设置
		 */
		jack.setDaemon(true);
		jack.start();
		/*while (true) {
			
		}*/
	}
}
