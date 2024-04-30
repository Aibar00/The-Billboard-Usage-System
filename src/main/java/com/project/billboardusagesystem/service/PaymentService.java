package com.project.billboardusagesystem.service;

import com.project.billboardusagesystem.model.Payment;

import java.util.List;
import java.util.Optional;

public interface PaymentService {
    Optional<Payment> findById(Long id);
    List<Payment> findAllPayment();
    Payment savePayment(Payment payment);
    Payment updatePayment(Payment payment);
    void deletePayment(Long id);
}
