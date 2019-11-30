package thread;
/**
 * �̵߳����ȼ�
 * �̲߳���������ȡCPUʱ��Ƭ��ֻ�ܱ����ı�
 * �̵߳��������䡣
 * �����̵߳����ȼ��������̶ȵĸ���ĳ���߳�
 * ��ȡCPUʱ��Ƭ�Ĵ�����
 * �������߳����ȼ�Խ�ߵ��̻߳�ȡCPUʱ��Ƭ��
 * ������Խ�ࡣ
 * @author Java
 *
 */
public class PriorityDemo {
	public static void main(String[] args) {
		Thread norm = new Thread(){
			public void run(){
				for (int i = 0; i < 10000; i++) {
					System.out.println("nor");
				}
			}
		};
		Thread max = new Thread(){
			public void run(){
				for (int i = 0; i < 10000; i++) {
					System.out.println("max");
				}
			}
		};
		Thread min = new Thread(){
			public void run(){
				for (int i = 0; i < 10000; i++) {
					System.out.println("min");
				}
			}
		};
		max.setPriority(Thread.MAX_PRIORITY);
		min.setPriority(Thread.MIN_PRIORITY);
		max.start();
		min.start();
		norm.start();
	}

}
