package com.example.ejbexam.controller;

import com.example.ejbexam.dto.SaleDTO;
import com.example.ejbexam.entity.Sale;
import com.example.ejbexam.repository.SaleRepository;
import com.example.ejbexam.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/sale")
public class SaleController {
    @Autowired
    private SaleService saleService;

//    @GetMapping()
//    public List<Sale> findAll (){
//        return saleService.getList();
//    }
//
//    @PostMapping()
//    public SaleDTO create (@RequestBody Sale sale){
//        return saleService.save(sale);
//    }
}
