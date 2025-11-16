package com.tnsif.springone;

import java.util.ArrayList;
public class Cart {
 
 // List to store multiple Product objects
 private ArrayList<Product> productList;

 /**
  * Getter method to retrieve the list of products in the cart.
  * @return ArrayList of Product objects.
  */
 public ArrayList<Product> getProductList() {
     return productList==null ? new ArrayList<>():productList;
 }

 /**
  * Setter method to inject the list of products into the cart.
  * This method is used by Spring when autowire="byName".
  * @param productList ArrayList of Product objects to be set in the cart.
  */
 public void setProductList(ArrayList<Product> productList) {
     this.productList = productList;
 }
}