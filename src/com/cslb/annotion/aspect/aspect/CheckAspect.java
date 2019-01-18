package com.cslb.annotion.aspect.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(1)
@Aspect
@Component
public class CheckAspect {

	
	@Before("execution(* com.cslb.arithmetic.Arithmetic.*(..))")
	public void check(JoinPoint jp) {
		int  a = (int) jp.getArgs()[0] ;
		if (a<0) {
			System.out.println("调用方法 传入的参数 不符合 要求 ");
		}
		
	}
}
