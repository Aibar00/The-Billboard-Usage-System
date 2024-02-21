package com.project.billboardusagesystem.service;

import com.github.javafaker.Faker;
import com.project.billboardusagesystem.model.Billboard;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.IntStream;

@Service
public class BillboardService {
    public List<Billboard> findAllBillboard() {
        return List.of(
                Billboard.builder().billboardId(1).location("Abaya Pravda").status("used").endDate(LocalDate.now()).build(),
                Billboard.builder().billboardId(2).location("Tole-bi Saina").status("used").endDate(LocalDate.now()).build(),
                Billboard.builder().billboardId(3).location("Tashkentskaya Momyshuly").status("used").endDate(LocalDate.now()).build()
        );
    }
    private List<Billboard> billboards;

    @PostConstruct
    public void loadBillboardinDB() {
        Faker faker = new Faker();
        billboards = IntStream.rangeClosed(1, 100)
                .mapToObj(i -> Billboard.builder()
                        .billboardId(i)
                        .location(faker.app().name())
                        .status(faker.app().name())
                        .endDate(LocalDate.now())
                        .build())
                .toList();
    }
    public List<Billboard> allBillboards() {
        return billboards;
    }
    public Billboard billboardByID(int id){
        return billboards.stream()
                .filter(billboard -> billboard.getBillboardId() == id)
                .findFirst()
                .orElse(null);
    }
}
