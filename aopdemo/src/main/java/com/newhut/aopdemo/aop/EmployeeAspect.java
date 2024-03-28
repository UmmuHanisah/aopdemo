package com.newhut.aopdemo.aop;

import java.util.Date;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EmployeeAspect {

	// Controller layer
	@Before(value = "execution(* com.newhut.aopdemo.controller.EmployeeController.*(..))")
	public void beforeControllerAdvice(JoinPoint joinPoint) {
		System.out.println("Request to: " + joinPoint.getSignature() + " started at " + new Date());
		// joinPoint.getSignature() - will give name of the method
	}

	@After(value = "execution(* com.newhut.aopdemo.controller.EmployeeController.*(..))")
	public void afterControllerAdvice(JoinPoint joinPoint) {
		System.out.println("Request to: " + joinPoint.getSignature() + " started at " + new Date());
	}

	// Service layer
	@Before(value = "execution(* com.newhut.aopdemo.service.EmployeeService.*(..))")
	public void beforeServiceAdvice(JoinPoint joinPoint) {
		System.out.println("Request to: " + joinPoint.getSignature() + " started at " + new Date());
	}

	@After(value = "execution(* com.newhut.aopdemo.service.EmployeeService.*(..))")
	public void afterServiceAdvice(JoinPoint joinPoint) {
		System.out.println("Request to: " + joinPoint.getSignature() + " started at " + new Date());
	}
}
