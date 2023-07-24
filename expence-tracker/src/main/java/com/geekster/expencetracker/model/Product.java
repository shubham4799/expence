package com.geekster.expencetracker.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="tbl_product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="product_id")
    private Integer id;
    @Column(name="title")
    private String title;
    @Column(name="description")
    private String description;
    @Column(name="price")
    private Integer price;
}
