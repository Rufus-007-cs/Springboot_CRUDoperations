package com.project.webapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor//creates a constructor by default with arguments containing the variables in order
@Component
public class Product {
    public  Product(){

    }

    private int prodId;
    private String prodName;
    private int price;
}
