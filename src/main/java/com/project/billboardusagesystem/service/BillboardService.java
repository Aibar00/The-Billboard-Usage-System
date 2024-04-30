package com.project.billboardusagesystem.service;

import com.project.billboardusagesystem.model.Billboard;

import java.util.List;
import java.util.Optional;

public interface BillboardService {
    //will be used
    Optional<Billboard> findById(Long id);
    List<Billboard> findAllBillboard();
    Billboard saveBillboard(Billboard billboard);
    Billboard updateBillboard(Billboard billboard);
    void deleteBillboard(Long id);
}
