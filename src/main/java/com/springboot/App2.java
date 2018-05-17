package com.springboot;

import java.util.ArrayList;
import java.util.List;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan//此注解默认的时扫描该类平级的以及所有该类的所在包的子包
public class App2 {
	
	@Bean
	public List<String> createList() {
		return new ArrayList<String>();
	}

}
