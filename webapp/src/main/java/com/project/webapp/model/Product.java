package com.project.webapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor//creates a constructor by default with arguments containing the variables in order
@Component
@Entity
public class Product {
    public  Product(){

    }
    @Id
    private int prodId;
    private String prodName;
    private int price;
}
