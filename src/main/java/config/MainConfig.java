package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

import domain.Person;

// 配置类
@Configuration
// 这边可以不加，默认是当前包下的.
// useDefaultFilters默认为true，即指定包里面的全部扫描,关闭默认才能过滤
@ComponentScan(value="config",useDefaultFilters=false,
				// includeFilters:指的是config包下只扫Controller注解的类
				includeFilters={ 
					// ANNOTATION指定注解 ASSIGNABLE_TYPE指定的类型(范围精确到类) CUSTOM：自定义注解
					@Filter(type=FilterType.CUSTOM,value={JamesTypeFilter.class})	
				}
			  )
// 注意点：useDefaultFilters必须是true,然后才可以excludeFilters(排除过滤)
//         useDefaultFilters必须是false，关闭扫描全部之后才能再打开你不想关闭的includeFilters有效
public class MainConfig {

	// 在容器中注册一个javabean
	@Bean
	public Person getPerson1(){
		return new Person("WH",23);
	}
	
	@Bean
	public Person getPerson2(){
		return new Person("LYQ",23);
	}
}
