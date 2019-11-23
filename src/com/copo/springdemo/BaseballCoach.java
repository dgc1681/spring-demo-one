package com.copo.springdemo;

public class BaseballCoach implements Coach{
	
	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService theFortuneService) {
		this.fortuneService = theFortuneService;
	}
	
	@Override
	public String getFortune() {
		return fortuneService.getFortune();
	}
	
	@Override
	public String getDailyWorkout() {
		return "Rutina Baseball";
	}
}
