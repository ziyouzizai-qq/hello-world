package integer;
/**
 * ��װ�඼�ṩ��һ����̬����
 * parseXXX(String str)
 * ���Խ��ַ�������Ϊ��Ӧ�Ļ������ͣ�������Ҫ
 * ע�⣬���ַ��������ܹ���ȷ�����������Ϳ�
 * �Ա����ֵ��������׳��쳣��
 * @author Java
 *
 */
public class ParseDemo {

	public static void main(String[] args) {
		String str = "123.123";
		/*int d = Integer.parseInt(str);
		System.out.println(d);*/
		
		double d2 = Double.parseDouble(str);
		System.out.println(d2);
	}

}
