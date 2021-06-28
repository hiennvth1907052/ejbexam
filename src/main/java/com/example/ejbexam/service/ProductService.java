package com.example.ejbexam.service;

import com.example.ejbexam.dto.ProductDTO;
import com.example.ejbexam.entity.Product;
import com.example.ejbexam.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> saveAll(List<Product> list) {
        return productRepository.saveAll(list);
    }

    public List<Product> list(){
        return productRepository.findAll();
    }
}
