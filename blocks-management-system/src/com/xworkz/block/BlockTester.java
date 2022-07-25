package com.xworkz.block;

public class BlockTester {
	
	public BlockTester() {		
	}
	
	int blockinit;
	{
		System.out.println("Block is executed");
		blockinit=10;
	}
	
	static int blockinit1;
	static {
		System.out.println("Block is executed@");
		blockinit1=20;
	}
	
	
    public static void main(String[] args) {
		System.out.println("Main method Started");
		Blocks bk =  new Blocks();
		BlockTester b = new BlockTester();
		System.out.println(b.blockinit1);
		System.out.println(b.blockinit);
		System.out.println("Main method ended");
	}
}
