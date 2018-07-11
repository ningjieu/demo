package com.example.demo;

public class Wrapper {
	private BeanSingleton singleton;

	public BeanSingleton getSingleton() {
		return singleton;
	}

	public void setSingleton(BeanSingleton singleton) {
		this.singleton = singleton;
	}

	public Wrapper(BeanSingleton dynamoDBClient) {
		// TODO Auto-generated constructor stub
		singleton=dynamoDBClient;
		
	}

}
