package com.copo.springdemo;

public class CrecketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	private String emailAddres;
	private String team;
	
	public String getEmailAddres() {
		return emailAddres;
	}

	public void setEmailAddres(String emailAddres) {
		System.out.println("Setter method cricketcoachEmailAddres");
		this.emailAddres = emailAddres;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("Setter method cricketcoachTeam");
		this.team = team;
	}

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
