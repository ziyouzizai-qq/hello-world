package object;
/**
 * ����Point��д��Object��صķ���
 * @author Java
 *
 */
public class TestPoint {

	public static void main(String[] args) {
		Point p = new Point(1,2);
		/**
		 * ͨ�����Ƕ�����������Ҫʹ�õ�
		 * toString����ʱ,��Ӧ����д���
		 * ������Object�ṩ��������Ǹö���
		 * �ľ����û��ʲôʵ������
		 */
		String str = p.toString();
		System.out.println(str);
		/**
		 * System.out.println(Object obj);
		 * �÷����Ὣ���������toString����
		 * ���ص��ַ������������̨
		 */
		System.out.println(p);
		
		Point p2 = new Point(1,2);
		System.out.println(p==p2);//false
		/**
		 * ���Ƕ���������ʹ��equals����Ӧ��
		 * ��д�ⷽ����Object�ṩ��equals����
		 * �����ڲ������� "=="���бȽϵģ�û��
		 * ʵ�����塣
		 * ��java.API�ṩ���࣬toString��equals
		 * ���������ƽ�������д��
		 */
		System.out.println(p.equals(p2));//false
	}

}
