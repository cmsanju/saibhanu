package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Employee e = new Employee("Hari", "CTS", "23400");
		
		EmpDao em = (EmpDao)ctx.getBean("edao");
		
		em.save(e);
		
		//em.update(e);
		
		System.out.println("Done");
	}

}
