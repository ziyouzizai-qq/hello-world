package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * ��дһ������Ҫ���û������Լ������գ���ʽ
 * Ϊ��yyyy-MM-dd  1997-06-25
 * Ȼ�󾭹�������㣬���������Ϊֹһ������
 * �����졣
 * �����������10000��ļ����������죬�����ʽ
 * ͬ��Ϊ��yyyy-MM-dd
 * @author Java
 *
 */
//867168000000
//867879573504
public class Test {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		System.out.println("������������գ�");
		String birthday = sc.nextLine();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = sdf.parse(birthday);
		System.out.println(date);
		Date now = new Date();
		System.out.println(now);
		long liveTime = now.getTime()-date.getTime();
		System.out.println("liveTime:"+liveTime);
		int liveDays = (int) (liveTime/(1000*60*60*24));
		System.out.println("������"+liveDays+"��");
		long time = date.getTime()+1000L*60*60*24*10000;
		System.out.println(time);
		Date d = new Date();
		d.setTime(time);
		System.out.println(d);
		String line = sdf.format(d);
		System.out.println("�����գ�"+line);
	}
}
