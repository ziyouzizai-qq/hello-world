package thread;
/**
 * �߳��ṩ��һ����̬������
 * static void sleep(long ms)
 * ʹ��������������߳�����ָ�����롣��ʱ��
 * ���̻߳��Զ��ص�RUNNABLE״̬���ȴ��ٴβ���
 * ���С�
 * @author Java
 *
 */
public class SleepDemo {
	public static void main(String[] args) {
		System.out.println("����ʼ��");
		while (true) {
			System.out.println("��ã�");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		//System.out.println("���������");
	}
}
