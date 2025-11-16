package com.tnsif.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCDemo {
	public static void main(String[] args) {
		
		ApplicationContext con=new ClassPathXmlApplicationContext("beans.xml");
		Phone p1=con.getBean("phone1",Phone.class);
		
		p1.calling();
		p1.internet();
		
		Phone p2=con.getBean("phone2",Phone.class);
		
		p2.calling();
		p2.internet();
		
		Phone p3=con.getBean("phone3",Phone.class);
		
		p3.calling();
		p3.internet();
	}
}