package com.copo.springdemo;

public class HappyFortuneService implements FortuneService{
	
	@Override
	public String getFortune() {
		return "Suerte en su dia!";
	}
}
