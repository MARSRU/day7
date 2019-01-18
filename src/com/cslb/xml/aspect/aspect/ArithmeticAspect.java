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

		System.out.println("���� ǰ��֪ͨ�� �����ڸ��� :" + asList.get(0) + "\t" + name + "\t" + asList.get(1));

	}

	
	public void afterMethod(JoinPoint jp) {

		String name = jp.getSignature().getName();
		System.out.println("���� ���� ֪ͨ�� �����ڸ��� : " + name + "������ҵ������ ����");
	}

	// ����ֵ ֪ͨ
	
	public void returnMethod(JoinPoint jp, Object result) {

		String name = jp.getSignature().getName();

		System.out.println("��� " + name + "�����Ľ����" + result);
	}

	// �쳣֪ͨ
	public void throwReturnMethod(JoinPoint jp, Exception ex) {

		String name = jp.getSignature().getName();

		System.out.println("��� " + name + "���� �����쳣 ��" + ex);
	}

	

}
