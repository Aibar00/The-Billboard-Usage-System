package com.project.billboardusagesystem.repository;

import com.project.billboardusagesystem.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
