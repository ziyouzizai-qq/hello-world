package integer;
/**
 * ��װ��
 * ��װ����Ϊ�˽���������Ͳ���ֱ�Ӳ�������
 * ���󿪷������⡣
 * ����6���������͵İ�װ�༯����Number�ࡣ
 * java.lang.Number��һ�������࣬�����˼���
 * ���󷽷���Ҫ���������͵İ�װ����Խ����ʾ
 * ������һ�����������ͷ��ء�
 * @author Java
 *
 */
public class IntegerDemo {

	public static void main(String[] args) {
		int d = 128;
		//ת��Ϊ��װ��
	//	Integer i1 = new Integer(d);
	//	Integer i2 = new Integer(d);
		//�Ƽ���valueOfת��Ϊ��װ��
		Integer i1 = Integer.valueOf(d);
		Integer i2 = Integer.valueOf(d);
		
		System.out.println(i1==i2);
		System.out.println(i1.equals(i2));
		
		/**
		 * ��װ��ת��Ϊ��������
		 */
		d = i1.intValue();
		System.out.println(d);
		
		double d1 = i1.doubleValue();
		System.out.println(d1);
		
		byte d2 = i1.byteValue();//���
		System.out.println(d2);
		
		/**
		 * �������͵İ�װ�඼��������������
		 * MAX_VALUE
		 * MIN_VALUE
		 * ���ڱ�ʾ�ð�װ���Ӧ�Ļ������͵�
		 * ȡֵ��Χ
		 */
		int imax = Integer.MAX_VALUE;
		System.out.println(imax);
		int imin = Integer.MIN_VALUE;
		System.out.println(imin);
		
		float fmax = Float.MAX_VALUE;
		System.out.println(fmax);
		float fmin = Float.MIN_VALUE;
		System.out.println(fmax);
	}

}
