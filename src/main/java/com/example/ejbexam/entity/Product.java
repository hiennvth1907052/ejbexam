package com.example.ejbexam.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String prodName;
    private String description;
    private double price;
    private Date dateOfManf;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "sale")
    private Set<Sale> sales;

    public Product(String name, String des, Date date, double price) {
        this.prodName = name;
        this.description = des;
        this.dateOfManf = date;
        this.price = price;
    }
}
