package thread;
/**
 * ���̲߳����İ�ȫ���⡣
 * ������������̲߳�������ͬһ��Դʱ�������߳�
 * �л�ʵ�ʵĲ�ȷ���ԣ��ᵼ��ִ�в�����Դ�Ĵ���
 * ˳��δ�������˳��ִ�У����ֲ������ҵ������
 * ����ʱ���ܵ���ϵͳ̱����
 * 
 * ���������������ͬһ����Դ��Ϊͬ��������������
 *      �Ⱥ�˳��Ĳ�����
 * @author Java
 *
 */
public class SyncDemo {
	public static void main(String[] args) {
		Table table = new Table();
		Thread t1 = new Thread(){
			public void run(){
				while (true) {
					int bean = table.getBean();
					Thread.yield();
					System.out.println(getName()+":"+bean);
				}
			}
		};
		Thread t2 = new Thread(){
			public void run(){
				while (true) {
					int bean = table.getBean();
					Thread.yield();
					System.out.println(getName()+":"+bean);
				}
			}
		};
		t1.start();
		t2.start();
	}
}
class Table{
	private int beans = 20;
	/**
	 * ��һ��������synchronized���κ󣬸÷���
	 * ��Ϊ"ͬ������"����������̲߳���ͬʱ�ڷ�
	 * ���ڲ����У�ǿ���ö���߳���ִ��ͬһ��
	 * ����ʱ��Ϊͬ�������ͽ���˲�����ȫ����
	 * 
	 * �ڷ�����ʹ��synchronized����ôͬ��������
	 * ������ǵ�ǰ�����������󣬼��������ڲ�����
	 * ��this
	 * @return
	 */
	public synchronized int getBean(){
		if (beans==0) {
			throw new RuntimeException("û�ж�����");
		}
		//ģ���߳�ִ�е�����û��ʱ����
		Thread.yield();
		return beans--;
	}
}