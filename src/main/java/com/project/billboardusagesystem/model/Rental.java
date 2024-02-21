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
public class Rental {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rentalId;
    private int billboardId;
    private int clientId;
    private int packageId;
    private int paymentId;
    private LocalDate startDate;
    private LocalDate endDate;
}
