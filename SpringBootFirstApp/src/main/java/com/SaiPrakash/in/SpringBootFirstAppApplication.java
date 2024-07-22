 package com.SaiPrakash.in;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootFirstAppApplication {

	public static void main(String[] args) {
	ApplicationContext ac = SpringApplication.run(SpringBootFirstAppApplication.class, args);
	EmpService es = ac.getBean("eob", EmpService.class);
	System.out.println(es);
	}

}
