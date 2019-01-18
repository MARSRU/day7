package com.cslb.xml.aspect.test;


import com.cslb.annotion.aspect.utils.ApplictionContextUtils;
import com.cslb.xml.aspect.arithmetic.Arithmetic;

public class Test {

	public static void main(String[] args) {

		Arithmetic arithmetic = ApplictionContextUtils.getAriContext(Arithmetic.class);

		int add = arithmetic.add(1111, 2222);

	
		System.out.println();
		System.out.println();
		System.out.println();
		
		int sub = arithmetic.sub(-3, 4);
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		int div = arithmetic.div(3, 1);
		System.out.println();
		System.out.println();
		System.out.println();
		
		int mul = arithmetic.mul(3, 1);

	}

}
