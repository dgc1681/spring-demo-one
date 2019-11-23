package com.copo.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// Retrieve bean from spring container
		Coach coach = context.getBean("myCoach", Coach.class);	
		// Call methods on the bean
		System.out.println(coach.getDailyWorkout());
		// Close the context
		context.close();

	}

}
