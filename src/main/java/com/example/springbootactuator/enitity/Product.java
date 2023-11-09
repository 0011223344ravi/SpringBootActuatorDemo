package com.example.springbootactuator.enitity;

import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "product")
public class Product {
    private Integer id ;
    private String name ;
    private Double price;
    private Integer quantity;
}
