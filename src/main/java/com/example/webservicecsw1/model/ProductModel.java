package com.example.webservicecsw1.model;

import com.example.webservicecsw1.entity.Product;

import java.util.List;


public interface ProductModel{
  List<Product> getProduct();
        boolean addProduct(Product e);
        boolean updateProduct(Product e, int id);
}
