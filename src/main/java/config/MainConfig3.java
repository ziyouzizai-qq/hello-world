package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import domain.Dog;
import domain.Person;

// 配置类
@Configuration
@Import(value={Dog.class})
public class MainConfig3 {

	/**
	 * @Bean：相当于在xml中注册bean
	 * @Import：快速给容器导入一个组件
	 */
	@Bean()
	public Person getPerson1(){
		return new Person("LYQ",23);
	}
	
}
