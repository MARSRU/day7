package com.cslb.annotion.aspect.utils;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplictionContextUtils {

	

	public static  <T> T getAriContext(Class<T> c) {
		
      ApplicationContext  ariContext= new ClassPathXmlApplicationContext("bean-xml-arithmetic.xml");
      
      T bean = ariContext.getBean(c);
		
      return bean ; 
		
	}
}
