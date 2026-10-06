package com.vedrunaSevilla.product.persistance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vedrunaSevilla.product.persistance.model.Product;

public interface ProductRespository extends JpaRepository<Product, Long> {

}
