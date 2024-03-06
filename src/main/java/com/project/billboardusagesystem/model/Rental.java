package com.project.billboardusagesystem.model;

import lombok.Builder;
import lombok.Data;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@Table(name = "rental")
public class Rental {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rental_id")
    private int id;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;
    @ManyToOne
    @JoinColumn(name = "billboard_id")
    private Billboard billboard;
    @ManyToOne
    @JoinColumn(name = "payment_id")
    private Payment payment;
    @ManyToOne
    @JoinColumn(name = "price_package_id")
    private PricePackage pricePackage;
    private LocalDate startDate;
    private LocalDate endDate;
}
