package com.example.demo2;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class MyCommandLineRunner implements CommandLineRunner {

	@Autowired
	private ApplicationContext ac;
	@Value("${name}")
	private String name;

	@Override
	public void run(String... args) {
		
		/*
		 * // Do something... String []names= ac.getBeanDefinitionNames();
		 * Arrays.sort(names); for (String string : names) { System.out.println(string);
		 * } MyProperties
		 * mp=(MyProperties)ac.getBean("my-com.example.demo2.MyProperties");
		 * System.out.println(mp); Student s= (Student) ac.getBean("ss");
		 * System.out.println("学生会"+s.toString());
		 */
	}

}
