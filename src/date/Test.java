package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 编写一个程序，要求用户输入自己的生日，格式
 * 为：yyyy-MM-dd  1997-06-25
 * 然后经过程序计算，输出到今天为止一共活了
 * 多少天。
 * 再输入其出生10000天的纪恋日是哪天，输出格式
 * 同样为：yyyy-MM-dd
 * @author Java
 *
 */
//867168000000
//867879573504
public class Test {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你的生日：");
		String birthday = sc.nextLine();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = sdf.parse(birthday);
		System.out.println(date);
		Date now = new Date();
		System.out.println(now);
		long liveTime = now.getTime()-date.getTime();
		System.out.println("liveTime:"+liveTime);
		int liveDays = (int) (liveTime/(1000*60*60*24));
		System.out.println("您活了"+liveDays+"天");
		long time = date.getTime()+1000L*60*60*24*10000;
		System.out.println(time);
		Date d = new Date();
		d.setTime(time);
		System.out.println(d);
		String line = sdf.format(d);
		System.out.println("纪念日："+line);
	}
}
