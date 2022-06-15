package com.example.webservicecsw1.service;

import com.example.webservicecsw1.entity.Product;
import com.example.webservicecsw1.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ProductService {
    @Autowired
    private ProductRepository productRepositoty;
    public List<Product> getProduct() {
        return productRepositoty.findAll();
    }
    public Product addProduct(Product product) {
        return productRepositoty.save(product);
    }
    public List<Product> saveAll(List<Product> products){
        return productRepositoty.saveAll(products);
    }
    public Optional<Product> findById(Integer id) {
        return productRepositoty.findById(id);
    }
}
