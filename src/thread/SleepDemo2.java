package thread;
/**
 * sleep����Ҫ����봦���ж��쳣��ԭ�����ڵ�
 * һ���̵߳�����sleep������������״̬�Ĺ���
 * ����������������interrupt()�����ж�ʱ����
 * �ͻ���sleep�������׳��쳣����ʱ������
 * ������߳�ֱ���жϣ������ж�����������״̬
 * @author Java
 *
 */
public class SleepDemo2 {

	public static void main(String[] args) {
		/**
		 * JDK8֮ǰ������JVM�ڴ�������⣬��һ��
		 * Ҫ��
		 * ��һ�������ľֲ��������������������
		 * �ֲ��ڲ����������ǣ����������������
		 * ��final�ġ�
		 */
		Thread lin = new Thread(){
			public void run(){
				System.out.println("�֣��������ݣ�˯����ɣ�");
				try {
					Thread.sleep(100000000);
				} catch (InterruptedException e) {
					System.out.println("�֣������أ������أ�����������");
				}
				System.out.println("�֣�����");
				
			}
		};
		Thread huang = new Thread(){
			public void run(){
				System.out.println("�ƣ���ʼ��ǽ��");
				for (int i = 0; i < 5; i++) {
					System.out.println("�ƣ�80");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {

					} 
				}
				System.out.println("�ѵ���");
				System.out.println("�ƣ��㶨��");
				lin.interrupt();
			}
		};
		lin.start();
		huang.start();
	}

}
