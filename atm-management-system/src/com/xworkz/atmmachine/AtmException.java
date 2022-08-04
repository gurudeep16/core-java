package com.xworkz.atmmachine;

public class AtmException extends Exception{
	@Override
	public String toString() {
		
		return "Limit is 200-25000 and Rs.50 is not available in ATM";
	}

}
