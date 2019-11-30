package first;

import java.util.Calendar;
import java.util.Date;

public class Test {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println("cal:"+cal );
		
		Date date = cal.getTime();
		System.out.println("date:"+date);
	}
}
