package first;

import java.util.Calendar;
import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FirstSpring {

	public static void main(String[] args) {
		/*
		 * 启动Spring容器
		 * ApplicationContext是一个接口，定义了
		 * Spring容器需要提供的方法。
		 * ClassPathXmlApplicationContext
		 * 是一个实现了ApplicationContext接口
		 * 的一个类，该类会依据类路径去查找
		 * 配置文件，然后启动Spring容器。
		 */
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		//通过容器获得对象
		Apple ap1 = ac.getBean("ap1",Apple.class);
		System.out.println("ap1:"+ap1);
		
		//java.util.Date   new Date()
		Date date1 = ac.getBean("date1", Date.class);
		System.out.println("date1:"+date1);
		
		
		Calendar call = ac.getBean("call",Calendar.class);
		System.out.println("call:"+call);
		
		Date date2 = ac.getBean("date2",Date.class);
		System.out.println("date2:"+date2);
		
	}

}
