package string;
/**
 * String�ṩ��һ�����صľ�̬������valueOf
 * ���Խ�����������ת��Ϊ�ַ���
 * @author Java
 *
 */
public class ValueOfDemo {

	public static void main(String[] args) {
		int d = 1;
		String str = String.valueOf(d);
		System.out.println(str);	
		
		double dou = 1.1;
		str = String.valueOf(dou);
		System.out.println(str);
		
		str = d+"";
	}

}
