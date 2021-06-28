package com.example.ejbexam.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Sale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int slNo;
    private String salesmanID;
    private String salesmanName;
    private String dos;
    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH}, fetch = FetchType.LAZY)
    @JoinColumn(name = "prodID")
    private Product product;
    @Column(insertable = false, updatable = false)
    private int prodID;

    public Sale(String id, String name, String dos, Product product) {
        this.salesmanID = id;
        this.salesmanName = name;
        this.dos = dos;
        this.product = product;
    }
}
