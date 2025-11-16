package com.tnsif.springannotations.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BookMain {

	public static void main(String[] args) {
		@SuppressWarnings("resources")
		ApplicationContext context= new AnnotationConfigApplicationContext(ApplicationConfig.class);
		Order or= (Order)context.getBean("order");
		double price=or.calculateTotalPrice();
		or.displayOrderDetails();
		System.out.println("Total bill amount: "+price);

	}

}