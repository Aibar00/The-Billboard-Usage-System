package com.project.billboardusagesystem.model;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
@Data
@Builder
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int paymentId;
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
    private int index;
}
