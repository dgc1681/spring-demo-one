package com.copo.springdemo;

public class CrecketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public CrecketCoach() {
		System.out.println("Non arg constructor cricket coach");
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Setter method cricketcoach");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {		
		return "Entrenamiento con la bola a diario";
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
