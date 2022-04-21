package com.examly.springapp;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductService {
    @Autowired
    public ProductRepository pr;
    
    public void addProduct(Product p) {
        pr.save(p);
    }
    
    public void deleteProductById(String productId) {
        pr.deleteById(productId);
    }
    
    public List<Product> getAllProduct() {
        List<Product> s = new ArrayList<Product>();
        pr.findAll().forEach(s::add);
        return s;
    }
    
    public Product getProductById(String productId, Product p) {
        return pr.findById(productId).get();
    }
    
    public List<Product> getproductByType(String type, Product p) {
        List<Product>g = new ArrayList<Product>();
        p.setType(type);
        if(p.getType().toString()==type)
            g.add(p);
        return g;
    }
}
