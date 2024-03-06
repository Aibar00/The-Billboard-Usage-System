package com.project.billboardusagesystem.repository;

import com.project.billboardusagesystem.model.Billboard;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Repository
public class InMemoryBillboardDAO {

    private final List<Billboard> BILLBOARDS = new ArrayList<>();

    public Billboard findById(int id) {
        return BILLBOARDS.stream()
                .filter(element -> element.getId() == id)
                .findFirst()
                .orElse(null);
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
                .filter(index -> BILLBOARDS.get(index).getId() == billboard.getId())
                .findFirst()
                .orElse(-1);
        if(billboardIndex > -1) {
            BILLBOARDS.set(billboardIndex, billboard);
            return billboard;
        }
        return null;
    }

    public void deleteBillboard(int id) {
        var billboard = findById(id);
        if(billboard != null){
            BILLBOARDS.remove(billboard);
        }
    }
}
