package com.example.demo2;

import java.util.Arrays;

import org.apache.logging.log4j.core.Logger;
import org.apache.logging.log4j.jul.LogManager;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@ConfigurationPropertiesScan("com.example.demo2")
@EnableTransactionManagement
public class Demo2Application {
	

	public static void main(String[] args) {
		SpringApplication.run(Demo2Application.class, args);
	}
	
	 @Bean
	    public ExitCodeGenerator exitCodeGenerator() {
	        return () -> 11;
	    }
	
	
		
		/*
		 * @Bean public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		 * return args -> {
		 * 
		 * System.out.println("Let's inspect the beans provided by Spring Boot:");
		 * 
		 * String[] beanNames = ctx.getBeanDefinitionNames(); Arrays.sort(beanNames);
		 * for (String beanName : beanNames) { System.out.println(beanName); }
		 * 
		 * };}
		 */
		 
		/*
		 * @Bean //@ConfigurationProperties(prefix="my") public Student
		 * anotherProperties() { return new Student(); }
		 */

}
