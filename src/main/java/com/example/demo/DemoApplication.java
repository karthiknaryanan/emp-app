package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoApplication {

	public static void main(String[] args) {
		//ApplicationContext ctx= new AnnotationConfigApplicationContext(SpringClass.class);
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		Employee employee = (Employee)context.getBean(Employee.class);
	    System.out.println(employee); 
	}

}
