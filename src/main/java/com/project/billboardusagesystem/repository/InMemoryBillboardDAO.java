package com.project.billboardusagesystem.repository;

import com.project.billboardusagesystem.model.Billboard;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;

@Repository
public class InMemoryBillboardDAO {

    private final List<Billboard> BILLBOARDS = new ArrayList<>();

    public Optional<Billboard> findById(Long id) {
        return BILLBOARDS.stream()
                .filter(element -> Objects.equals(element.getId(), id))
                .findFirst();
    }

    public List<Billboard> findAllBillboard() {
        return BILLBOARDS;
    }

    public Billboard saveBillboard(Billboard billboard) {
        BILLBOARDS.add(billboard);
        return billboard;
    }

    public Billboard updateBillboard(Billboard billboard) {
        var billboardIndex = IntStream.range(0, BILLBOARDS.size())
                .filter(index -> Objects.equals(BILLBOARDS.get(index).getId(), billboard.getId()))
                .findFirst()
                .orElse(-1);
        if(billboardIndex > -1) {
            BILLBOARDS.set(billboardIndex, billboard);
            return billboard;
        }
        return null;
    }

    public void deleteBillboard(Long id) {
        findById(id).ifPresent(BILLBOARDS::remove);
    }
}
