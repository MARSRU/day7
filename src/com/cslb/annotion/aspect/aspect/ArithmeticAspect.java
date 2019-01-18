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

		System.out.println("���� ǰ��֪ͨ�� �����ڸ��� :" + asList.get(0) + "\t" + name + "\t" + asList.get(1));

	}

	@After("execution(* com.cslb.arithmetic.Arithmetic.*(..))")
	public void afterMethod(JoinPoint jp) {

		String name = jp.getSignature().getName();
		System.out.println("���� ���� ֪ͨ�� �����ڸ��� : " + name + "������ҵ������ ����");
	}

	// ����ֵ ֪ͨ
	@AfterReturning(value = "execution(* com.cslb.arithmetic.Arithmetic.*(..))", returning = "result")
	public void returnMethod(JoinPoint jp, Object result) {

		String name = jp.getSignature().getName();

		System.out.println("��� " + name + "�����Ľ����" + result);
	}

	// �쳣֪ͨ
	@AfterThrowing(value = "execution(* com.cslb.arithmetic.Arithmetic.*(..))", throwing = "ex")
	public void throwReturnMethod(JoinPoint jp, Exception ex) {

		String name = jp.getSignature().getName();

		System.out.println("��� " + name + "���� �����쳣 ��" + ex);
	}

	// ����֪ͨ ���֪ͨ �� ǰ�� 4 ��֪ͨ ���ɵ�һ����

	/*@Around("execution(* com.cslb.arithmetic.Arithmetic.*(..))")
	public Object aroundMethod(ProceedingJoinPoint pjp) {

		Object result = null;
		String name = null ;
		try {

			name = pjp.getSignature().getName();

			List<Object> asList = Arrays.asList(pjp.getArgs());

			System.out.println("���� ǰ��֪ͨ�� �����ڸ��� :" + asList.get(0) + "\t" + name + "\t" + asList.get(1));

			System.out.println("���� ���� ֪ͨ�� �����ڸ��� : " + name + "������ҵ������ ����");

			
			result = pjp.proceed();
			System.out.println("��� " + name + "�����Ľ����" + result);
			
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			System.out.println("��� " + name + "���� �����쳣 ��" + e);
		}

		
		return  result ;
	}*/

}
