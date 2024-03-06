package com.project.billboardusagesystem.service;

import com.github.javafaker.Faker;
import com.project.billboardusagesystem.model.Billboard;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.IntStream;

public interface BillboardService {
    //will be used
    Billboard findById(int id);
    List<Billboard> findAllBillboard();
    Billboard saveBillboard(Billboard billboard);
    Billboard updateBillboard(Billboard billboard);
    void deleteBillboard(int id);
}
