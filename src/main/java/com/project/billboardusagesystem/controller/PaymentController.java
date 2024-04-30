package com.project.billboardusagesystem.controller;

import com.project.billboardusagesystem.model.Payment;
import com.project.billboardusagesystem.service.PaymentService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/payments")
@AllArgsConstructor
public class PaymentController {

    private final PaymentService paymentService;

    @GetMapping("/{id}")
    public ResponseEntity<Payment> findById(@PathVariable Long id){
        return paymentService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/all_payment")
    public List<Payment> findAllPayment(){
        return paymentService.findAllPayment();
    }

    @PostMapping("save_payment")
    public Payment savePayment(@RequestBody Payment payment){
        return paymentService.savePayment(payment);
    }

    @PutMapping("update_payment")
    public Payment updatePayment(@RequestBody Payment payment){
        return paymentService.updatePayment(payment);
    }

    @DeleteMapping("delete_payment/{id}")
    public void deletePayment(@PathVariable Long id){
        paymentService.deletePayment(id);
    }
}
