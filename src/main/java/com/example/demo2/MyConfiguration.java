package com.example.demo2;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
//@EnableConfigurationProperties(MyProperties.class)
public class MyConfiguration {

}
