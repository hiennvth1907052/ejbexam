package com.example.ejbexam.service;

import com.example.ejbexam.dto.SaleDTO;
import com.example.ejbexam.entity.Product;
import com.example.ejbexam.entity.Sale;
import com.example.ejbexam.repository.ProductRepository;
import com.example.ejbexam.repository.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleService {
    @Autowired
    private SaleRepository saleRepository;

    public Sale create(Sale sale) {
        return saleRepository.save(sale);
    }
}
