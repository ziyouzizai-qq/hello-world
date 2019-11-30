package date;

import java.util.Calendar;
import java.util.Date;

/**
 * java.util.Calendar
 * ������
 * Calendar����������ʱ���API��ʹ�÷ǳ��ķ�
 * �㡣��������һ�������࣬�ṩ��һ�����ڻ�ȡ
 * ʵ����ľ�̬������getInstance().�÷�������
 * ���ݵ�ǰϵͳ���ڵ�����ȡһ��ʹ�õ�ʵ����
 * �󲿷ֵ�����ȡ�����Ķ��ǣ�GregorianCalendar
 * ��������
 * @author Java
 *
 */
public class CalendarDemo1 {
	public static void main(String[] args) {
		//CalendarĬ��Ҳ��ʾ��ǰϵͳʱ��
		Calendar calendar = Calendar.getInstance();
		/**
		 * Calendar��toString�������Ϣ�ܶ�
		 * ���ǲ���ֱ�۵Ŀ�������ʱ��
		 */
		System.out.println(calendar);
		/**
		 * Date getTime()
		 * Calendar�ṩ��getTime�������Ի�ȡ
		 * һ��Date����ʵ����ʾ�ľ��ǵ�ǰcalendar
		 * ����ʾ������
		 */
		Date date = calendar.getTime();
		System.out.println(date);
		
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//		System.out.println(sdf.format(date));
		
		/**
		 * Calendar��һ��������
		 * void setTime(Date date)
		 * �÷��������õ�ǰCalendar��ʾ������Date
		 * ����ʾ������
		 */
	}
}
