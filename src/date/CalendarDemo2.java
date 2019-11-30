package date;

import java.util.Calendar;

/**
 * Calendar�ṩ�˻�ȡ��ʱ�������Ϣ�ķ�����
 * int get(int field)
 * ����Ϊһ��intֵ����ͬ��ֵ��ʾ��ͬ��ʱ��
 * ���������������������Щ���֣�Calendar��
 * ��Щ������Ϊ������
 * @author Java
 *
 */
public class CalendarDemo2 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		//��ȡ��
		int year = calendar.get(Calendar.YEAR);
		//��ȡ��
		int month = calendar.get(Calendar.MONTH);
		/**
		 * ��ȡ��
		 * DAY_OF_MONTH  ���е���
		 * DATE    	  	 ���е���
		 * DAY_OF_WEEK   ���е���
		 * DAY_OF_YEAR	 ���е���
		 */
		
		int date = calendar.get(Calendar.DAY_OF_MONTH);
		System.out.println(year+"-"+month+"-"+date);
		
		int h = calendar.get(Calendar.HOUR_OF_DAY);
		int m = calendar.get(Calendar.MINUTE);
		int s = calendar.get(Calendar.SECOND);
		System.out.println(h+":"+m+":"+s);
		
		//�鿴�����ǽ���ĵڼ��죿
		int days = calendar.get(Calendar.DAY_OF_YEAR);
		System.out.println(days);
		
		//�������ܼ���
		int dow = calendar.get(Calendar.DAY_OF_WEEK);
		String[] data = {"��","һ","��","��","��","��","��"};
		System.out.println("��"+data[dow-1]);
		
		/**
		 * ��ȡָ����ʱ���������������ֵ
		 */
		days = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(days);
	}
}
