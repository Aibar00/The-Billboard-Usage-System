package com.project.billboardusagesystem.model;

import lombok.Builder;
import lombok.Data;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "price_package")
public class PricePackage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "price_package_id")
    private Long id;
    private String name;
    private int price;
    private String type;
    @OneToMany(mappedBy = "pricePackage")
    private List<Rental> rentals;
}
