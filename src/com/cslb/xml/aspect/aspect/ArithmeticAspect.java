package com.cslb.xml.aspect.aspect;

import java.util.Arrays;
import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.springframework.stereotype.Component;

@Component
public class ArithmeticAspect {


	public void befroeMethod(JoinPoint jp) {

		String name = jp.getSignature().getName();

		List<Object> asList = Arrays.asList(jp.getArgs());

		System.out.println("我是 前置通知， 我在在跟踪 :" + asList.get(0) + "\t" + name + "\t" + asList.get(1));

	}

	
	public void afterMethod(JoinPoint jp) {

		String name = jp.getSignature().getName();
		System.out.println("我是 后置 通知， 我在在跟踪 : " + name + "方法的业务运算 结束");
	}

	// 返回值 通知
	
	public void returnMethod(JoinPoint jp, Object result) {

		String name = jp.getSignature().getName();

		System.out.println("这个 " + name + "方法的结果是" + result);
	}

	// 异常通知
	public void throwReturnMethod(JoinPoint jp, Exception ex) {

		String name = jp.getSignature().getName();

		System.out.println("这个 " + name + "方法 出现异常 ：" + ex);
	}

	

}
