package com.project.billboardusagesystem.service.impl;

import com.project.billboardusagesystem.model.Payment;
import com.project.billboardusagesystem.repository.PaymentRepository;
import com.project.billboardusagesystem.service.PaymentService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Primary
@AllArgsConstructor
public class PaymentServiceImpl implements PaymentService {

    private final PaymentRepository paymentRepository;

    @Override
    public Optional<Payment> findById(Long id) {
        return paymentRepository.findById(id);
    }

    @Override
    public List<Payment> findAllPayment() {
        return paymentRepository.findAll();
    }

    @Override
    public Payment savePayment(Payment payment) {
        return paymentRepository.save(payment);
    }

    @Override
    public Payment updatePayment(Payment payment) {
        return paymentRepository.save(payment);
    }

    @Override
    public void deletePayment(Long id) {
        paymentRepository.deleteById(id);
    }
}
