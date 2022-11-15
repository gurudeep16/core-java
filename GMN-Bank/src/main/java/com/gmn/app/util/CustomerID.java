package com.gmn.app.util;

import java.util.Random;

public class CustomerID {
	public static int generateCustId() {
		Random random = new Random();
		int nextInt=random.nextInt(1000000);
		return nextInt;
	}

}
