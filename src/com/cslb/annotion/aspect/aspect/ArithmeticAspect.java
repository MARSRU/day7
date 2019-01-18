package com.cslb.annotion.aspect.aspect;

import java.util.Arrays;
import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
@Order(2)
@Aspect
@Component
public class ArithmeticAspect {

	@Before("execution(* com.cslb.arithmetic.Arithmetic.*(..))")
	public void befroeMethod(JoinPoint jp) {

		String name = jp.getSignature().getName();

		List<Object> asList = Arrays.asList(jp.getArgs());

		System.out.println("我是 前置通知， 我在在跟踪 :" + asList.get(0) + "\t" + name + "\t" + asList.get(1));

	}

	@After("execution(* com.cslb.arithmetic.Arithmetic.*(..))")
	public void afterMethod(JoinPoint jp) {

		String name = jp.getSignature().getName();
		System.out.println("我是 后置 通知， 我在在跟踪 : " + name + "方法的业务运算 结束");
	}

	// 返回值 通知
	@AfterReturning(value = "execution(* com.cslb.arithmetic.Arithmetic.*(..))", returning = "result")
	public void returnMethod(JoinPoint jp, Object result) {

		String name = jp.getSignature().getName();

		System.out.println("这个 " + name + "方法的结果是" + result);
	}

	// 异常通知
	@AfterThrowing(value = "execution(* com.cslb.arithmetic.Arithmetic.*(..))", throwing = "ex")
	public void throwReturnMethod(JoinPoint jp, Exception ex) {

		String name = jp.getSignature().getName();

		System.out.println("这个 " + name + "方法 出现异常 ：" + ex);
	}

	// 环绕通知 这个通知 把 前面 4 个通知 集成到一起了

	/*@Around("execution(* com.cslb.arithmetic.Arithmetic.*(..))")
	public Object aroundMethod(ProceedingJoinPoint pjp) {

		Object result = null;
		String name = null ;
		try {

			name = pjp.getSignature().getName();

			List<Object> asList = Arrays.asList(pjp.getArgs());

			System.out.println("我是 前置通知， 我在在跟踪 :" + asList.get(0) + "\t" + name + "\t" + asList.get(1));

			System.out.println("我是 后置 通知， 我在在跟踪 : " + name + "方法的业务运算 结束");

			
			result = pjp.proceed();
			System.out.println("这个 " + name + "方法的结果是" + result);
			
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			System.out.println("这个 " + name + "方法 出现异常 ：" + e);
		}

		
		return  result ;
	}*/

}
