package com.aop.example.test;

import org.junit.jupiter.api.Test;

import com.annotations.Sysout;

public class AOPTest {
	
	@Test
	void test() {
		annotationTest();
	}
	
	@Sysout
	private void annotationTest() {
		System.out.println("Annotation Test method");
	}

}
