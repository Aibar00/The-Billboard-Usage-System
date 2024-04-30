package com.project.billboardusagesystem.service.impl;

import com.project.billboardusagesystem.model.Payment;
import com.project.billboardusagesystem.repository.InMemoryPaymentDAO;
import com.project.billboardusagesystem.service.PaymentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class InMemoryPaymentServiceImpl implements PaymentService {

    private final InMemoryPaymentDAO repository;

    @Override
    public Optional<Payment> findById(Long id){
        return repository.findById(id);
    }

    @Override
    public List<Payment> findAllPayment(){
        return repository.findAllPayment();
    }

    @Override
    public Payment savePayment(Payment payment){
        return repository.savePayment(payment);
    }

    @Override
    public Payment updatePayment(Payment payment){
        return repository.updatePayment(payment);
    }

    @Override
    public void deletePayment(Long id){
        repository.deletePayment(id);
    }
}
