package thread;
/**
 * �߳��ṩ�˻�ȡ�����Ϣ�ķ���
 * @author Java
 *
 */
public class ThreadDemo3 {
	public static void main(String[] args) {
		/**
		 * static Thread currentThread()
		 * �÷���������ȡ��������������߳�
		 * main����Ҳ�ǿ�һ���߳����еģ���JVM����
		 * ����Զ�����һ���߳���ִ��main������er
		 * ����̵߳����ֽ���"main"�����ǳ���Ϊ���߳�
		 * 
		 * ��ȡ����main�������߳�
		 */
		Thread main = Thread.currentThread();
		System.out.println("����main�������̣߳�"+main);
		dosome();
		
		Thread t = new Thread(){
			public void run(){
				Thread t = Thread.currentThread();
				System.out.println("�Զ����̣߳�"+t);
				dosome();
			}
		};
		t.start();
	}
	public static void dosome(){
		Thread t = Thread.currentThread();
		System.out.println("����main�������̣߳�"+t);
	}
}
