package date;

import java.util.Date;
/**
 * java.util.Date
 * Date��ÿһ��ʵ�����ڱ�ʾһ��ʱ���
 * �ڲ�ά��һ��longֵ����ֵ��¼��ʱ����1970��
 * 1��1��00:00:00����ǰDate��ʾ��ʱ��֮����
 * �����ĺ��롣
 * ����Date����ʱ���Լ�ǧ������⣬���Դ󲿷�
 * ����ʱ��ķ�����������Ϊ��ʱ�Ĳ��ٽ���ʹ��
 * �ˡ�
 * @author Java
 *
 */
public class DateDemo {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		
		long time = date.getTime();
		System.out.println(time);
		
		time = time+1000*60*60*24;
		date.setTime(time);
		System.out.println(date);
		
		date.setTime(0);
		System.out.println(date);

	}
}
