package config;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import domain.Person;

// 配置类
@Configuration
public class MainConfig2 {

	// 在容器中注册一个javabean
	/**
	 * SCOPE_PROTOTYPE：默认是单例
	 * SCOPE_PROTOTYPE：多例
	 * @return 返回给容器的对象
	 */
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	@Bean
	public Person getPerson1(){
		return new Person("WH",23);
	}
	
	@Lazy
	@Bean()
	public Person getPerson2(){
		return new Person("LYQ",23);
	}
	
}
