package com.xworkz.pub;

public class Bouncer {


	
	public void check(int age) throws PubException {
		System.out.println("check method started");
		
		if(age >=18) {
			System.out.println("allowed");
		}
		else {
			throw new PubException();
		}
		System.out.println("check method ended");
	}

}
