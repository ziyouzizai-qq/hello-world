package threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * �̳߳�
 * �̳߳���Ҫ���������ã�
 * 1�������߳�����
 * 2�������߳�
 * @author Java
 *
 */
public class ThreadPoolDemo {
	public static void main(String[] args) {
		ExecutorService threadPool = Executors.newFixedThreadPool(2);
		for (int i = 0; i < 5; i++) {
			Runnable runn = new Runnable(){
				 public void run(){
					Thread t = Thread.currentThread();
					try {
						System.out.println(t.getName()+"����ִ������");
						Thread.sleep(5000);
						System.out.println(t.getName()+"���ڽ�������");
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			};
			//������ָ�ɸ��̳߳�
			threadPool.execute(runn);
			System.out.println("ָ����һ��������߳�");
		}//forѭ������
		
		//ֹͣ�̳߳أ����ٽ�������
		/*
		 *shutdown()�������ú��̳߳ز���
		 *���������񣬲��һὫ�̳߳�������
		 *������ִ�к��Զ�ֹͣ
		 *
		 *shutdownNow()�������ú��̳߳�
		 *��ǿ���ж������߳�����ֹͣ
		 */
		threadPool.shutdown();
		//ǿ������ֹͣ�̳߳�
		threadPool.shutdownNow();
		System.out.println("�̳߳�ֹͣ��");
	}
}
