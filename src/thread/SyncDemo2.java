package thread;
/**
 * ͬ����
 * �﷨��
 * synchronized(ͬ������������){
 * 		��Ҫͬ�����еĴ���Ƭ��
 * }
 * 
 * ͬ������Ը���ȷ�Ŀ�����Ҫͬ�����еĴ���
 * Ƭ�Ρ���Ч����Сͬ����Χ�����ڱ�֤������ȫ
 * ��ǰ������ߴ��벢�����е�Ч��
 * ʹ��ͬ������ƶ��߳�ͬ�����б���Ҫ����Щ
 * �߳̿�����ͬ������������Ϊ[ͬһ��]��
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
			System.out.println(t.getName()+"���������·�������");
			Thread.sleep(5000);
			synchronized (this) {
				System.out.println(t.getName() + "���������·�������");
				Thread.sleep(5000);
			}
			System.out.println(t.getName()+"�����뿪");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
