package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBoot1Application {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(SpringBoot1Application.class, args);
		Student st = ac.getBean(Student.class);
		System.out.println(st.getRoll());
		System.out.println(st.getName());
	}

}
