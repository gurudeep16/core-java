package com.xworkz.atmmachine;

import java.util.Scanner;



public class AtmTester {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the amount");
		int amt =sc.nextInt();
		AtmWithdraw bo = new AtmWithdraw();
		try {
			bo.withDraw(amt);
		} catch (AtmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("main method ended");
		sc.close();
	}

}
