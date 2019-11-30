package date;

import java.util.Calendar;

/**
 * void set(int field,int value)
 * ��ָ����ʱ���������ָ����ֵ
 * @author Java
 *
 */
public class CalendarDemo3 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		/**
		 * ��ʾ2008-08-08 20:08:08
		 */
		calendar.set(Calendar.YEAR, 2008);
		
		calendar.set(Calendar.MONTH, 7);
		
		calendar.set(Calendar.DAY_OF_MONTH, 8);
		
		calendar.set(Calendar.HOUR_OF_DAY, 20);
		calendar.set(Calendar.MINUTE, 8);
		calendar.set(Calendar.SECOND, 8);
		//�����getTime��������ע�͵����������������ͬ
		System.out.println(calendar.getTime());
		/**
		 * ������������Ϊ8�ţ�����set����������ÿ��
		 * ���ú����Ľ�ʱ������ö�Ӧֵ��������
		 * getTimeʱ����ʵ�ʼ��㣬��������Ĵ�����
		 * �������ڼ�ʱ��Ӱ�����е��죬��ᵼ�¸ղ�
		 * ���õ�8�ű����ǵ���û����
		 * �Դ˵Ľ���취�ǣ������ó����໥Ӱ��ʱ��
		 * ������֮ǰ���ù�����������һ��getTime����
		 * ��Calendar����һ�ε�������������þ�û��
		 * �����ˡ�
		 */
		calendar.set(Calendar.DAY_OF_WEEK, Calendar.SATURDAY);
		System.out.println(calendar.getTime());
	}
}
