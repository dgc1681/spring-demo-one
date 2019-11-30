package com.copo.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		// Load the springo configuration
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// retrive bean from spring container
		CrecketCoach coach = context.getBean("myCrecketCoach",CrecketCoach.class);
		// call methods on the bean
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getFortune());
		// close context
		context.close();
	}

}
