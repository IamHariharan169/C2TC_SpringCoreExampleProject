package com.tnsif.springone;

import java.util.ArrayList;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tnsif.springone.Product;

public class ProductMain {
    public static void main(String[] args) {
    	ApplicationContext ac = new ClassPathXmlApplicationContext("productconfig.xml");
  	
    	Cart cartByType = ac.getBean("cartByType", Cart.class);
    	
    	System.out.println("Total price using autowire byType: " + calculateTotal(cartByType));

        Cart cartByName = ac.getBean("cartByName", Cart.class);

        System.out.println("Total price using autowire byName: " + calculateTotal(cartByName));

        Cart cartWithRef = ac.getBean("cart", Cart.class);
        System.out.println("Total price using explicit reference: " + calculateTotal(cartWithRef));
		
		  Product p1 = ac.getBean("productThree", Product.class); 
		  Product p2 = ac.getBean("productThree", Product.class);
		  
		  System.out.println(p1 == p2);
		  
		  Product p3 = ac.getBean("productOne", Product.class); 
		  Product p4 = ac.getBean("productOne", Product.class);
		  
		  System.out.println(p3 == p4);
		 
		 
    }

    private static double calculateTotal(Cart cart) 
    {
    	ArrayList<com.tnsif.springone.Product> list = cart.getProductList();
        double total = 0;

        for (com.tnsif.springone.Product prod : list) {
            total += prod.getPrice();
        }
        return total;
    }
}