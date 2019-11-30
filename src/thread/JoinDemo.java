package thread;


/**
 * �߳��ṩ��һ��������
 * void join()
 * �÷�������Э���߳�֮���ͬ������
 * 
 * ͬ�����첽��
 * ͬ�����У�������˳��
 * �첽���У����д�����˳�򣬶��̲߳������о�
 *          ���첽����
 * @author Java
 *
 */
public class JoinDemo {
	//��ʶͼƬ�Ƿ��������
	private static boolean isFinish = false;
	public static void main(String[] args) {
		Thread download = new Thread(){
			public void run(){
				System.out.println("down����ʼ����ͼƬ������");
				for (int i = 0; i <= 100; i++) {
					System.out.println("down:"+i+"%");
					try {
						Thread.sleep(20);
					} catch (InterruptedException e) {
					}
				}
				System.out.println("down:����ͼƬ��ϣ�");
				isFinish = true;
			}
		};
		Thread show = new Thread(){
			public void run(){
				System.out.println("show����ʼ��ʾ������");
				//����ͼƬǰӦ�ȵȴ������߳̽�ͼƬ�������
				try {
					/**
					 * show�߳��ڵ���download.join()������
					 * �ͽ���������״̬��ֱ��download�߳�
					 * ��run����ִ����ϲŻ���������
					 */
					download.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				if (!isFinish) {
					throw new RuntimeException("����ͼƬʧ��");
				}
				System.out.println("show����ʾͼƬ���");
			}
		};
		download.start();
		show.start();
	}
}
