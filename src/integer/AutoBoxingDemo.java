package integer;
/**
 * JDK1.5�汾�Ƴ���һ�����ԣ�
 * �Զ���װ��
 * �������Ǳ������Ͽɵģ��������ڻ������ͺ�
 * ���Ӧ����������֮�以�ำֵ�ǣ���������
 * �Զ���ȫ����������֮�����ת����
 * @author Java
 *
 */
public class AutoBoxingDemo {

	public static void main(String[] args) {
		/**
		 * �����˱��������Զ��������ԣ�
		 * �������Ჹȫ���룬����װ��ת��Ϊ
		 * �������͡�
		 * ����Ĵ���ᱻ�������������Ϊ
		 * int d = new Integer(1).intValue();
		 */
		int d = new Integer(1);
		/**
		 * �����Զ��������ԣ��������Ჹ�����
		 * Integer i = Integer.valueOf(d);
		 */
		Integer i = d;

	}

}
