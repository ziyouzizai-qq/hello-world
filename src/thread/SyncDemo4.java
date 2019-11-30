package thread;
/**
 * ������
 * ���������Ƭ�α�synchronized�����κ���Щ
 * ͬ�����ͬ����������������ͬһ��ʱ����Щ
 * ����Ƭ�ξ��ǻ���ġ�����̲߳���ͬʱ����Щ
 * ���������С�
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
			System.out.println(t.getName()+"����ִ��A����");
			Thread.sleep(5000);
			System.out.println(t.getName()+"ִ��A�������");
			
		} catch (Exception e) {
			
		}
	}
	public synchronized void methodB(){
		Thread t = Thread.currentThread();
		try {
			System.out.println(t.getName()+"����ִ��B����");
			Thread.sleep(5000);
			System.out.println(t.getName()+"ִ��B�������");
			
		} catch (Exception e) {
			
		}
	}
}