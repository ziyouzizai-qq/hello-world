package lambda;
/**
 * lambda���ʽ
 * lambda������java�Ժ���ʽ��ɡ�
 * ������ʨ��jdk8֮���Ƴ��ġ�
 * ʹ��la��������Է����ݴ��������ڲ��ࡣ
 * �﷨��
 * (�����б�)->{
 * 		������
 *    }
 * ʹ��lambda�����������ڲ���ʵ�������Ľӿ�
 * ����ֻ����һ��������������벻ͨ��
 * 
 * @author Java
 *
 */
public class LambdaDemo1 {
	public static void main(String[] args) {
		Runnable r1 = new Runnable() {
			public void run() {
				System.out.println("hello1");
			}
		};
		Thread t1 = new Thread(r1);
		t1.start();
		Runnable r2 = () ->{
			System.out.println("hello2");
		};
		Thread t2 = new Thread(r2);
		t2.start();
		/**
		 * ��������ֻ��һ�仰ʱ�������ġ�{}��
		 * ����ʡ��
		 */
//		Runnable r3 = () ->System.out.println("hello3");
		Thread t3 = new Thread(
				() ->System.out.println("hello3")
		);
		t3.start();
			
	}
}
