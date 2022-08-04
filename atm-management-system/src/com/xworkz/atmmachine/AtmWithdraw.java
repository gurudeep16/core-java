package com.xworkz.atmmachine;

public class AtmWithdraw {
	
	
	public void withDraw(double amt) throws AtmException {
		System.out.println("method started");
		if( amt <= 25000.00 && amt>=200 && amt%100==0 ) {
			System.out.println("Collect the cash");	
		}
		else {
			throw new AtmException();
		}
	}

}
