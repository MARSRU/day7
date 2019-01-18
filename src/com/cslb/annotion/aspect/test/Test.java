package com.cslb.annotion.aspect.test;

import com.cslb.annotion.aspect.arithmetic.Arithmetic;
import com.cslb.annotion.aspect.utils.ApplictionContextUtils;

public class Test {

	public static void main(String[] args) {

		Arithmetic arithmetic = ApplictionContextUtils.getAriContext(Arithmetic.class);

		int add = arithmetic.add(-1, -2);

	
		System.out.println();
		System.out.println();
		System.out.println();
		
		int sub = arithmetic.sub(-3, 4);

	
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		int div = arithmetic.div(3, 1);
		

	}

}
