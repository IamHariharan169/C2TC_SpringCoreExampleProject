package com.tnsif.dependencyinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MathsExam {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("beansdi.xml");
		
		//setter injection
		Student s1=context.getBean("Bhuvana",Student.class);
		Student s2=context.getBean("Anju",Student.class);
		
		s1.showInfo();
		s2.showInfo();
		
		//Constructor injection
		Student1 s3=context.getBean("Abi",Student1.class);
		Student1 s4=context.getBean("Lashu",Student1.class);
		
		s3.showInfo();
		s3.showInfo();
		
	}
}