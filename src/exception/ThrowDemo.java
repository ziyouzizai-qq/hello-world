package exception;
/**
 * �����쳣���׳�
 * @author Java
 *
 */
public class ThrowDemo {

	public static void main(String[] args) {
		System.out.println("����ʼ��");
		Person p = new Person();
		/**
		 * �����﷨�����ǲ�����ҵ���߼�Ҫ��
		 * ��ʱsetAge�����п�Ժ�����쳣�׳�
		 * Ҫ���������ʱ����
		 */
		//�ù����try-catch
		try {
			/**
			 * ������һ������throws�����쳣�׳�
			 * �ķ���ʱ��Ҫ����봦����쳣��
			 * ������ʽ�����֣�
			 * 1��ʹ��try-catch���񲢽���쳣
			 * 2���ڵ�ǰ�����ϼ���ʹ��throws����
			 * 	  ���쳣���׳�
			 */
			p.setAge(1000);
		} catch (IllegalAgeException e) {
			e.printStackTrace();
		}
		//p.setAge(1000);
		System.out.println(p.getAge());
		System.out.println("���������");
	}

}
