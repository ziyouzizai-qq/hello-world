package exception;


/**
 * ʹ�õ�ǰ������쳣���׳�
 * @author Java
 *
 */
public class Person {
	private int age;

	public int getAge(){
		
		return age;
	}
		/**
		 * ͨ��һ��������ʹ��throw�׳�һ���쳣ʱ
		 * ��Ҫ�ڷ�������ʱʹ��throws�������쳣�ĵ�
		 * �׳���֪ͨ�����߽�����쳣��
		 * ֻ���׳�RuntimeException�����������쳣
		 * ʱ���Բ�Ҫ��������
		 * @param age
		 * @throws Exception
		 */
	public void setAge(int age) throws IllegalAgeException {
		if (age<0||age>100) {
			throw new IllegalAgeException("���䲻�Ϸ�");
		}
		this.age = age;
	}
	
}
