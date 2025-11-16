package com.tnsif.springone;

public class Product {
 
 // Unique identifier for the product
 private int productId;

 // Name of the product
 private String productName;

 // Price of the product
 private float price;

 /**
  * Getter method to retrieve the product ID.
  * @return The product ID.
  */
 public int getProductId() {
     return productId;
 }

 /**
  * Setter method to set the product ID.
  * @param productId The product ID to be set.
  */
 public void setProductId(int productId) {
     this.productId = productId;
 }

 /**
  * Getter method to retrieve the product name.
  * @return The name of the product.
  */
 public String getProductName() {
     return productName;
 }

 /**
  * Setter method to set the product name.
  * @param productName The name of the product to be set.
  */
 public void setProductName(String productName) {
     this.productName = productName;
 }

 /**
  * Getter method to retrieve the product price.
  * @return The price of the product.
  */
 public float getPrice() {
     return price;
 }

 /**
  * Setter method to set the product price.
  * @param price The price of the product to be set.
  */
 public void setPrice(float price) {
     this.price = price;
 }
}