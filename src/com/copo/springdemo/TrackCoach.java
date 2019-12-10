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
	
	public void initTrack() {
		System.out.println("Este es el inicio del track coach");
	}
	
	public void cleanupTrack() {
		System.out.println("Este es el fin del track coach");
	}
}
