package com.example.btth4_congnghejava.repository;

import org.springframework.stereotype.Repository;

import com.example.btth4_congnghejava.model.ShoeProduct;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ShoeProductRepository extends JpaRepository<ShoeProduct, Long> {
    
}
