package com.project.webapp.controller;

import com.project.webapp.model.Product;
import com.project.webapp.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    private ProductService productService;
        //constructor DI
        public ProductController(ProductService productService){

            this.productService = productService;
        }
        @GetMapping("/products")
        public List<Product>getProducts(){
            return productService.getProducts();

        }

        @GetMapping("/products/{prodId}")//{prodId} maps the value to the variable
        public Product getProductById(@PathVariable int prodId){//pathVar shows to where the value must be mapped
            return productService.getProductById(prodId);
        }
        @PostMapping("/products")
        public void addProduct(@RequestBody Product product){//req bod when json sent from client to server
            productService.addProduct(product);
        }
        @PutMapping("/product")
        public void updateProduct(@RequestBody Product product){
            productService.updateProduct(product);
        }
        @DeleteMapping("/products/{prodId}")
        public void deleteProductById(@PathVariable int prodId){
            productService.deleteProductById(prodId);
        }

    }

