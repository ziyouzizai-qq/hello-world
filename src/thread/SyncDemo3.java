package thread;
/**
 * ��̬������ʹ��synchronized���Σ���ô�÷���
 * һ������ͬ��Ч��
 * ��̬������Ӧ��ͬ������������Ϊ��ǰ���
 * �����(class��ʵ��)���������ں��淴��
 * �Ŀγ��н�����
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
		System.out.println(t.getName()+"���ڵ���dosome����");
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println(t.getName()+"����dosome������ϣ�");
	}
}