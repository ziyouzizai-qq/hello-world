package test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.MainConfig;
import config.MainConfig2;
import config.MainConfig3;
import domain.Person;

public class MainTest {

	@Test
	public void testConfigByAnnotation(){
		// 读取配置类(相当于application.xml配置文件)
		ApplicationContext app = new AnnotationConfigApplicationContext(MainConfig.class);
//		Person person = app.getBean(Person.class);
//		Person person = (Person) app.getBean("person");
//		System.out.println(person);
		
		String[] beanNames = app.getBeanNamesForType(Person.class);
		for (String beanName : beanNames) {
			// beanName是方法的名字
			System.out.println(beanName);
		}
	}
	
	@Test
	public void testConfigByAnnotation01(){
		// 读取配置类(相当于application.xml配置文件)
		ApplicationContext app = new AnnotationConfigApplicationContext(MainConfig.class);
//		OrderController cont = (OrderController)app.getBean("orderController");
//		OrderService service = (OrderService)app.getBean("orderService");
//		OrderDao dao = (OrderDao)app.getBean("orderDao");
//		System.out.println(cont);
//		System.out.println(service);
//		System.out.println(dao);
		System.out.println("======================");
		String[] beanDefinitionNames = app.getBeanDefinitionNames();
		for (String beanDefinitionName : beanDefinitionNames) {
			System.out.println(beanDefinitionName);
		}
	}
	
	/**
	 * 测试scope
	 */
	@Test
	public void testConfigScope(){
		// 读取配置类(相当于application.xml配置文件)
		ApplicationContext app = new AnnotationConfigApplicationContext(MainConfig2.class);
		Person person1 = (Person) app.getBean("getPerson1");
		Person person2 = (Person) app.getBean("getPerson1");
		System.out.println(person1 == person2);
		
	}
	
	/**
	 * 测试Lazy
	 */
	@Test
	public void testConfigLazy(){
		// 读取配置类(相当于application.xml配置文件)
		ApplicationContext app = new AnnotationConfigApplicationContext(MainConfig2.class);
		Person person = (Person) app.getBean("getPerson2");
		System.out.println(person);
		
	}
	
	@Test
	public void testConfigByAnnotation02(){
		// 读取配置类(相当于application.xml配置文件)
		ApplicationContext app = new AnnotationConfigApplicationContext(MainConfig3.class);
		String[] beanDefinitionNames = app.getBeanDefinitionNames();
		for (String beanDefinitionName : beanDefinitionNames) {
			System.out.println(beanDefinitionName);
		}
	}
}
