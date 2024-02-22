package com.grocery.app.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table
@Getter
@Setter
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double price;
    private int stock;
}
