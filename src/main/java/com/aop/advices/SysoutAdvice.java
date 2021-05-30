package com.aop.advices;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;

public class SysoutAdvice {
	
	@Around("@annotation(com.annotations.Sysout)")
	public Object print(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		System.out.println("Start....");
		Object object = proceedingJoinPoint.proceed();
		System.out.println("End....");
		return object;
		
	}

}
