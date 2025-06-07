package com.example.btth4_congnghejava.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.btth4_congnghejava.model.ShoeProduct;
import com.example.btth4_congnghejava.repository.ShoeProductRepository;

@Service
public class ShoeProductService {
    private final ShoeProductRepository repository;

    public ShoeProductService(ShoeProductRepository repository) {
        this.repository = repository;
    }

    public List<ShoeProduct> getAllProducts() {
        return repository.findAll();
    }

    public void saveAll(List<ShoeProduct> products) {
        repository.saveAll(products);
    }
}
