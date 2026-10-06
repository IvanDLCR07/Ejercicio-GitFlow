package com.vedrunaSevilla.product.persistance.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity 
@Table (name = "products")
@NoArgsConstructor 
@Data 
public class Product {

    @Id 
    @Column (name = "product_id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long productId;

    @Column (name = "product_name")
    private String name;

    @Column(name = "product_price") 
    private double price;

    @Column(name = "product_description") 
    private String description;

    @Column (name = "product_code")
    private String sku;

    
}
