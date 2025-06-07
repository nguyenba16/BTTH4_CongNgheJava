package com.example.btth4_congnghejava.controller;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.btth4_congnghejava.model.ShoeProduct;
import com.example.btth4_congnghejava.service.ShoeProductService;

@RestController
@RequestMapping("/product")
public class ShoeProductController {
    private final ShoeProductService service;

    public ShoeProductController(ShoeProductService service) {
        this.service = service;
    }

    @GetMapping
    public List<ShoeProduct> getAllShoes() {
        return service.getAllProducts(); // trả về JSON
    }
}
