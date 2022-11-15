package com.gmn.app.util;

import java.util.Random;

public class GenerateAccountNumber {
	public static int generateAccNo() {
		System.out.println("generate axx");
		Random random = new Random();
		int nextInt=random.nextInt(10000000);
		return nextInt;
	}

}
