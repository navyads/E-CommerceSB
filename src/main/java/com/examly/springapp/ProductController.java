package com.examly.springapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @Autowired
    private ProductService ps;
    
    @PostMapping("/saveProduct")
    public void addProduct(@RequestBody Product p)
    {
        ps.addProduct(p);
    }
    
    @PostMapping("/getByType/{type}")
    public List<Product> getByType(@PathVariable String type,
    @RequestBody Product p)
    {
        return ps.getproductByType(type,p);
    }
    
    @DeleteMapping("/deleteProduct/{productId}")
    public void deleteProductById(@PathVariable String productId)
    {
        ps.deleteProductById(productId);
    }
    
    @GetMapping("/getAllProduct")
    public List<Product> getAllProduct()
    {
        return ps.getAllProduct();
    }
    
    @GetMapping("/getProduct/{productId}")
    public Product getProductById(@PathVariable String
    productId,@RequestBody Product p)
    {
        return ps.getProductById(productId,p);
    }
}

