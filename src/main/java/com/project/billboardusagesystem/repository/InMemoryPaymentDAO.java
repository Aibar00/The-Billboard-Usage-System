package com.project.billboardusagesystem.repository;

import com.project.billboardusagesystem.model.Payment;
import com.project.billboardusagesystem.model.UserEntity;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;

@Repository
public class InMemoryPaymentDAO {
    private final List<Payment> PAYMENTS = new ArrayList<>();

    public Optional<Payment> findById(Long id) {
        return PAYMENTS.stream()
                .filter(element -> Objects.equals(element.getId(), id))
                .findFirst();
    }

    public List<Payment> findAllPayment() {
        return PAYMENTS;
    }

    public Payment savePayment(Payment payment) {
        PAYMENTS.add(payment);
        return payment;
    }

    public Payment updatePayment(Payment payment) {
        var paymentIndex = IntStream.range(0, PAYMENTS.size())
                .filter(index -> Objects.equals(PAYMENTS.get(index).getId(), payment.getId()))
                .findFirst()
                .orElse(-1);
        if(paymentIndex > -1) {
            PAYMENTS.set(paymentIndex, payment);
            return payment;
        }
        return null;
    }

    public void deletePayment(Long id) {
        findById(id).ifPresent(PAYMENTS::remove);
    }
}
