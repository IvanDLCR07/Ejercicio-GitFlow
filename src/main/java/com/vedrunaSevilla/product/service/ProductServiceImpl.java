package com.vedrunaSevilla.product.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.vedrunaSevilla.product.persistance.model.Product;
import com.vedrunaSevilla.product.persistance.repository.ProductRespository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {

    ProductRespository productRespository;

    @Override
    public List<Product> getAllProducts() {
        return productRespository.findAll();
    }

}
