package thread;
/**
 * 
 * �߳��ǲ������д����
 * �����ִ����̵߳ķ�ʽ��
 * ��ʽһ���̳�Thread����дrun������run������
 * ����ϣ���߳�ִ�е��߼���
 * @author Java
 *
 */
public class ThreadDemo1 extends Thread{
	public static void main(String[] args) {
		Thread t1 = new MyThead1();
		Thread t2 = new MyThead2();
		/**
		 * �����߳�Ҫ����start������������
		 * ֱ�ӵ���run��������start��������
		 * ��Ϻ�run�����ܿ�ᱻ�߳����е�
		 * �á�
		 */
		t1.start();
		t2.start();
	}
}
/**
 * ��һ�ִ����̵߳ķ�ʽ�Ƚϼ�ֱ�ӣ�����ȱ��
 * ��Ҫ��������
 * 1��������Ҫ�̳��̣߳��⵼�²����ټ̳�������
 * 	  ʵ�ʿ����о���Ҫ����ĳ������Ĺ��ܣ���ô
 * 	  �ڼ̳��̺߳����ټ̳���������кܶ಻��
 * 
 * 2�������߳����ͬʱ��дrun��������ᵼ��
 * 	  �߳����߳�Ҫִ�е�������һ����Ȼ�����
 * 	  ��ϵ���������̵߳����á�
 * @author Java
 *
 */
class MyThead1 extends Thread{
	public void run() {
        for (int i = 0; i <1000; i++) {
			System.out.println("����˭��");
		}
    }
}
class MyThead2 extends Thread{
	public void run() {
        for (int i = 0; i <1000; i++) {
			System.out.println("���ǲ�ˮ���");
		}
    }
}