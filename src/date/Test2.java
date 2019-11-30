package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * ������Ʒ�����գ�
 * ����һ����Ʒ���������ڣ���ʽ(yyyy-MM-dd)
 * �����뱣���ڵ�������
 * Ȼ�󾭹����������������Ʒ�������ڣ���ʽ
 * Ҳ�ǣ�yyyy-MM-dd
 * �����ռ��������Ʒ������ǰ���ܵ�����
 * @author Java
 *
 */
public class Test2 {
	public static void main(String[] args) throws ParseException {
		System.out.println("��������Ʒ���������ڣ���ʽ(yyyy-MM-dd)��");
		Scanner sc = new Scanner(System.in);
		String birthday = sc.nextLine();
		System.out.println("��������Ʒ�����ڣ�");
		int days = Integer.parseInt(sc.nextLine());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = sdf.parse(birthday);
		System.out.println("�������ڣ�"+sdf.format(date));
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.DAY_OF_YEAR, days-14);
		calendar.set(Calendar.DAY_OF_WEEK, Calendar.WEDNESDAY);
		System.out.println("������:"+sdf.format(calendar.getTime()));
	}
}
