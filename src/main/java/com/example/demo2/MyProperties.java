package com.example.demo2;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.convert.DurationUnit;
import org.springframework.stereotype.Component;
//@Component("mypro")
@ConfigurationProperties(prefix="my")
public class MyProperties {
	private int age;
	@DurationUnit(ChronoUnit.SECONDS)
	private Duration sessionTimeOut =Duration.ofSeconds(30);
	private HashMap<String, String>map;
	private String name;
	public int getAge() {
		return age;
	}
	
	public Duration getSessionTimeOut() {
		return sessionTimeOut;
	}

	public void setSessionTimeOut(Duration sessionTimeOut) {
		this.sessionTimeOut = sessionTimeOut;
	}

	public HashMap<String, String> getMap() {
		return map;
	}

	public void setMap(HashMap<String, String> map) {
		this.map = map;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "MyProperties [age=" + age + ", sessionTimeOut=" + sessionTimeOut + ", map=" + map + ", name=" + name
				+ "]";
	}



	

}
