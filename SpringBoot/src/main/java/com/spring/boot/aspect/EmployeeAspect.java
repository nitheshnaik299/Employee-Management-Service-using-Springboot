package com.spring.boot.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PutMapping;

@Aspect
@Component
public class EmployeeAspect {
	
	@Pointcut("within(com.spring.boot.service.EmployeeService )")
	public void op()
	{
		
	}
@Before("op()")
public void beginTransaction()
{
	System.out.println("Tarnsaction started");
}

@AfterThrowing("op()")
public void transactionFailure()
{
	System.out.println("Transaction failure");
}

@AfterReturning("op()")
public void afterTransaction()
{
	System.out.println("Transaction Ended");
}
}
