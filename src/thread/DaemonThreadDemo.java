package thread;
/**
 * �ػ��߳�
 * �ػ��߳��ֳ�Ϊ��̨�̣߳�Ĭ�ϴ������̶߳�
 * ����ͨ�̻߳��Ϊǰ̨�̣߳��߳��ṩ��һ��
 * ������
 * void setDaemon(boolean on)
 * ֻ�е��ø÷������������trueʱ�����̲߳�
 * �ᱻ����Ϊ�ػ��̡߳�
 * 
 * �ػ��߳���ʹ��������ͨ�߳�û�в�𣬵�����
 * ����ʱ������һ�����𣬼����߳̽���ʱ��������
 * ���е��ػ��̶߳��ᱻǿ��ֹͣ��
 * 
 * �̵߳Ľ�������һ�����������е���ͨ�̶߳�����
 * ʱ�����̼�������
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
				System.out.println("rose:��������������������aaa������");
				System.out.println("��ͨ��");
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
		 * ����Ϊ�ػ��߳�
		 * ע�⣺�������߳�����֮ǰ��������
		 */
		jack.setDaemon(true);
		jack.start();
		/*while (true) {
			
		}*/
	}
}
