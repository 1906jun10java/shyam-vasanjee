package com.revature.codeblocks;

public class Bird {
	{
		System.out.println("instance block 1");
		System.out.println("b1");
	}

	public Bird() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("In bird constructor");
		System.out.println("b2");
	}
	static {
		System.out.println("static block 1");
		System.out.println("b3");
	}

}


