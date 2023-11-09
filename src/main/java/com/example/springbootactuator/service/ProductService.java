package com.example.springbootactuator.service;


import com.example.springbootactuator.enitity.Product;

import java.util.List;

public interface ProductService {

    List<Product> getAllProducts();

    void addProduct(Product product);

    void updateProduct(Integer id ,Product product);

    void deleteProduct(Integer id);
}
