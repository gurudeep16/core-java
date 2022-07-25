package com.xworkz.block;

public class Blocks {
	
	public char[] blockinit1;
	public char[] blockinit;

	public Blocks() {
		System.out.println(this.getClass().getSimpleName()+" "+"object is created");
	}
	
	{
		System.out.println("block 1");
	}
	
	{
		System.out.println("block 2");
	}

}
