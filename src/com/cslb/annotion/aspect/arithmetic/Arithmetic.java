package com.cslb.annotion.aspect.arithmetic;

import org.springframework.stereotype.Component;

@Component
public class Arithmetic {

	public int add(int a, int b) {

		
		
		int result = a + b;

		return result;

	}

	public int sub(int a, int b) {
		
		int result = a - b;

		return result;
	}

	public int div(int a, int b) {
		int result = a / b;

		return result;
	}

	public int mul(int a, int b) {
		int result = a * b;

		return result;
	}

}
