package com.project.billboardusagesystem.model;

import lombok.Builder;
import lombok.Data;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@Table(name = "payment")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "payment_id")
    private Long id;
    private int amount;
    private LocalDate paymentDate;
    private String cardType;
    private int cardNumber;
    private String cardHolderName;
    private String validity;
    private int cvv;
    private String nameAddInfo;
    private String cityAddInfo;
    private String numberAddInfo;
    private String addressAddInfo;
    private int indexAddInfo;
    @OneToMany(mappedBy = "payment")
    private List<Rental> rentals;
}
