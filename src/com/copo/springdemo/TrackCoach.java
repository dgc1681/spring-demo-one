package com.copo.springdemo;

public class TrackCoach implements Coach{
	
	private FortuneService fortuneService;
	
	public TrackCoach() {
		
	}
	
	public TrackCoach(FortuneService theFortuneService) {
		this.fortuneService = theFortuneService;
	}
	
	@Override
	public String getFortune() {
		return "Just Do it "+fortuneService.getFortune();
	}
	
	@Override
	public String getDailyWorkout() {
		return "Correr!!!";
	}
}
