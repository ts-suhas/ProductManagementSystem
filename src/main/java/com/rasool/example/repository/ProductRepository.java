package com.rasool.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rasool.example.entity.Product;
/**
 * @author Rasool Malik Vempalli
 */
public interface ProductRepository extends JpaRepository<Product,Integer> {
    Product findByName(String name);
    Product deleteByName(String name);
}

