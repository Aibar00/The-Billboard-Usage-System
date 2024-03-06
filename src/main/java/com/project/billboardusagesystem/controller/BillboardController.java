package com.project.billboardusagesystem.controller;

import com.project.billboardusagesystem.model.Billboard;
import com.project.billboardusagesystem.service.BillboardService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/v1/billboards")
@AllArgsConstructor
public class BillboardController {

    private final BillboardService billboardService;

    @GetMapping("/welcome")
    public String welcome() {
        return "It is an unprotected page, but you are welcome!";
    }

    @GetMapping("/all-billboard")
    public List<Billboard> findAllBillboards() {
        return billboardService.findAllBillboard();
    }

    @GetMapping("/{id}")
    public Billboard billboardById(@PathVariable int id) {
        return billboardService.findById(id);
    }
}
