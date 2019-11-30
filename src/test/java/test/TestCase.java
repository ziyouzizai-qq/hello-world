package test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import basic.ExampleBean;
import basic.LazyBean;
import basic.MessageBean;
import first.Apple;
import ioc.A;
import ioc.Computer;

public class TestCase {
	
	@Test
	//测试  作用域
	public void test1(){
		//启动Spring容器
		ApplicationContext ac = new ClassPathXmlApplicationContext("basic.xml");
		
		ExampleBean eb1 = ac.getBean("eb1",ExampleBean.class);
		
		ExampleBean eb2 = ac.getBean("eb1",ExampleBean.class);
		
		System.out.println(eb1==eb2);
	}
	
	@Test
	//测试  初始化方法和销毁方法
	public void test2(){
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("basic.xml");
		MessageBean mb1 = ac.getBean("mb1",MessageBean.class);
		mb1.sendMsg();
		//关闭容器
		ac.close();
	}
	
	
	@Test
	//测试  延迟加载
	public void test3(){
		//启动Spring容器
		AbstractApplicationContext ac = new ClassPathXmlApplicationContext("basic.xml");
		
		LazyBean lazy = ac.getBean("lb1",LazyBean.class);
		//关闭容器
		ac.close();
	}
	
	@Test
	//测试  set方法注入
	public void test4(){
		//启动Spring容器
		ApplicationContext ac = new ClassPathXmlApplicationContext("ioc.xml");
		A a = ac.getBean("a1",A.class);
		a.service();
	}
	
	@Test
	//测试  Cpu方法注入Computer
	public void test5(){
		//启动Spring容器
		ApplicationContext ac = new ClassPathXmlApplicationContext("ioc.xml");
		Computer computer = ac.getBean("computer",Computer.class);
		computer.service();
	}
	
	@Test
	public void test6(){
		//启动Spring容器
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Apple ap1 = ac.getBean(Apple.class);
		
		Apple ap2 = ac.getBean(Apple.class);
		
		System.out.println(ap1==ap2);
	}
	
	@Test
	public void test7(){
		//启动Spring容器
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		String[] beanDefinitionNames = ac.getBeanDefinitionNames();
		for (String beanDefinitionName : beanDefinitionNames) {
			System.out.println(beanDefinitionName);
		}
	}
}
