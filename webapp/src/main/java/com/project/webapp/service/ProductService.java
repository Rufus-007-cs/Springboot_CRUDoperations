package com.project.webapp.service;

import com.project.webapp.model.Product;
import com.project.webapp.repo.ProductRepo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {
    private ProductRepo productRepo;
    public ProductService(ProductRepo productRepo){
        this.productRepo = productRepo;
    }

    public List<Product> getProducts(){
        return productRepo.findAll();

    }
    public Product getProductById(int prodId) {
       return productRepo.findById(prodId).orElse(new Product(0,"novalue",0));
    }

    public void addProduct(Product product) {
        productRepo.save(product);
    }

    public void updateProduct(Product product) {
         productRepo.save(product);//same as add
    }

    public void deleteProductById(int prodId) {
         productRepo.deleteById(prodId);
    }
}

