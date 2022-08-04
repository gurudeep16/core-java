package com.xworkz.pub;

import java.util.Scanner;

public class Tester {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the age");
		int age =sc.nextInt();
		Bouncer bo = new Bouncer();
		try {
			bo.check(age);
		} catch (PubException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("main method ended");
	}

}
