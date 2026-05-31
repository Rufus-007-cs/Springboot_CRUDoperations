package com.project.webapp.service;

import com.project.webapp.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {
    List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(101,"mac",500000),
            new Product(102,"playstation",40000)));

    public List<Product> getProducts(){
        return products;

    }
    public Product getProductById(int prodId) {
        for(Product product:products) {
            if (product.getProdId() == prodId) {
                return product;
            }
        }
        return (new Product(100,"No Item",0));
    }

    public void addProduct(Product product) {
       products.add(product);
    }

    public void updateProduct(Product product) {
        for(Product prod:products){
            if(prod.getProdId()== product.getProdId()){
                prod.setPrice(product.getPrice());
                prod.setProdName(product.getProdName());
                return;
            }
        }
    }

    public void deleteProductById(int prodId) {
        for(Product prod: products){
            if(prod.getProdId() == prodId){
                products.remove(prod);
                return;
            }
        }
    }
}
