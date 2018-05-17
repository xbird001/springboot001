package com.springboot;


import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

/*@SpringBootApplication*/
/*@Configuration//这个注解可以认为就是之前的spring的一个application.xml文件，二者可以认为是等同的*/
@ComponentScan//此注解，不会把标有@ComponentScan的类放到spring的容器中进行管理,他会扫描带有@componet注解的类
public class App {
	
	@Bean
	public Runnable createRunnable() {
		return () -> {System.out.println("SpringBoot is running ...");};
	}
	
	public static void main(String[] args) {
		/**
		 * SpringApplication.run(Object source, String... args);的run方法默认把source包装成一个Configuration注解过的类，即调用
		 * 此方法时，完全可以不用在对应的类上面添加任何注解，所以此时我们可以在任何source类中添加@bean注解，并获取对象
		 */
		ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
		context.getBean(Runnable.class).run();
		//把此处打开，需要把App2.class上面的注解换成@Component，或者是把SpringApplication.run(App.class, args)换成SpringApplication.run(App2.class, args)
		/*System.out.println(context.getBean("createList"));*/
		System.out.println(context.getBean("user"));
		System.out.println(context.getBean("map"));
		System.out.println(context.getBean("set"));
		
/*		SpringApplication sa = new SpringApplication();
		Set<Object> sources = new HashSet<Object>();
		sources.add(App2.class);
		sa.setSources(sources);
		sa.run(args);*/
		
	}

}
