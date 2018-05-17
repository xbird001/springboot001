package com.springboot;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component//此处等同于@Configeration
public class MyConfig {
	
	@Bean
	public Map<String,Object> map() {
		return new HashMap<String,Object>();
	}
	
	@Bean
	public Set<Object> set() {
		return new HashSet<Object>();
	}

}
