package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * 计算商品促销日：
 * 输入一个商品的生产日期，格式(yyyy-MM-dd)
 * 再输入保质期的天数。
 * 然后经过程序运算输出该商品促销日期，格式
 * 也是：yyyy-MM-dd
 * 促销日计算规则：商品过期日前两周的周三
 * @author Java
 *
 */
public class Test2 {
	public static void main(String[] args) throws ParseException {
		System.out.println("请输入商品的生产日期，格式(yyyy-MM-dd)：");
		Scanner sc = new Scanner(System.in);
		String birthday = sc.nextLine();
		System.out.println("请输入商品保质期：");
		int days = Integer.parseInt(sc.nextLine());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = sdf.parse(birthday);
		System.out.println("生产日期："+sdf.format(date));
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.DAY_OF_YEAR, days-14);
		calendar.set(Calendar.DAY_OF_WEEK, Calendar.WEDNESDAY);
		System.out.println("促销日:"+sdf.format(calendar.getTime()));
	}
}
