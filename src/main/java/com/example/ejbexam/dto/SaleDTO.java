package com.example.ejbexam.dto;

import com.example.ejbexam.entity.Sale;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SaleDTO {
    private String salesmanID;
    private String salesmanName;
    private String dos;
    private int ProdID;

    public SaleDTO(Sale sale) {
        this.setSalesmanID(sale.getSalesmanID());
        this.setSalesmanName(sale.getSalesmanName());
        this.setDos(sale.getDos());
        this.setProdID(sale.getProdID());
    }
}
