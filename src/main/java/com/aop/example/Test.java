package com.aop.example;

import com.annotations.Sysout;

public class Test {

	public static void main(String[] args) {
		testAOP();

	}
	
	
	@Sysout
	private static void testAOP() {
		System.out.println("Testing..");
		
	}

}
