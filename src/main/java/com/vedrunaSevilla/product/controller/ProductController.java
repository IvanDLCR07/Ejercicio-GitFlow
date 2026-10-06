package com.vedrunaSevilla.product.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vedrunaSevilla.product.persistance.model.Product;
import com.vedrunaSevilla.product.service.ProductService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping ("/api/v1/products")
@CrossOrigin 
@AllArgsConstructor 
public class ProductController {

    ProductService productService;

    @GetMapping 
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

}
