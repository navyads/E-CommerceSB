package com.examly.springapp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ecom")
public class Product {
    @Id
    private String productId;
    private String productName;
    private String description;
    private String quantity;
    private String price;
    private String type;
    
    public Product() {
    }
    
    public Product(String productId, String productName, String
    description, String quantity, String price,
    String type) {
        this.productId = productId;
        this.productName = productName;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
        this.type = type;
    }
    
    public String getProductId() {
        return productId;
    }
    
    public String getProductName() {
        return productName;
    }
    
    public String getDescription() {
        return description;
    }
    
    public String getQuantity() {
        return quantity;
    }
    
    public String getPrice() {
        return price;
    }
    
    public String getType() {
        return type;
    }
    
    public void setProductId(String productId) {
        this.productId = productId;
    }
    
    public void setProductName(String productName) {
        this.productName = productName;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
    
    public void setPrice(String price) {
        this.price = price;
    }
    
    public void setType(String type) {
        this.type = type;
    }
}
