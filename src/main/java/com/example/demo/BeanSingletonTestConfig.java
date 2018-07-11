package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class BeanSingletonTestConfig {
	@Bean
    public  BeanSingleton getDynamoDBClient() {
		BeanSingleton singleton = new BeanSingleton();
		System.out.println(singleton);
        return singleton;
    }

    @Bean
    public Wrapper getDynamoDb() {
    	Wrapper wrapper=new Wrapper(getDynamoDBClient());
    		System.out.println(wrapper.getSingleton());
        return wrapper;
    }
}
