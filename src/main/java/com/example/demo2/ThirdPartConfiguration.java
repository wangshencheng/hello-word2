package com.example.demo2;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration(proxyBeanMethods = false)
public class ThirdPartConfiguration {
	
	
	  @Bean ("ss")
	  @ConfigurationProperties(prefix="my")
	  public Student
	  anotherProperties() { 
		  return new Student(); }
	 

}
