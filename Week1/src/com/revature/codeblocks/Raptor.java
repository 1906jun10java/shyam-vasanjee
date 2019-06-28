package com.revature.codeblocks;

public class Raptor extends Bird {
	static {
		System.out.println("static block 2");
		System.out.println("r1");
	}

	public Raptor() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("In raptor constrictor");
		System.out.println("r2");
	}
	{
		System.out.println("Instance block 2");
		System.out.println("r3");
	}
	static {
		System.out.println("static block 3");
		System.out.println("r4");
	}
	

}
