package com.project.billboardusagesystem.service.impl;

import com.project.billboardusagesystem.model.Billboard;
import com.project.billboardusagesystem.repository.InMemoryBillboardDAO;
import com.project.billboardusagesystem.service.BillboardService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class InMemoryBillboardServiceImpl implements BillboardService {

    private final InMemoryBillboardDAO repository;

    @Override
    public Optional<Billboard> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<Billboard> findAllBillboard() {
        return repository.findAllBillboard();
    }

    @Override
    public Billboard saveBillboard(Billboard billboard) {
        return repository.saveBillboard(billboard);
    }

    @Override
    public Billboard updateBillboard(Billboard billboard) {
        return repository.updateBillboard(billboard);
    }

    @Override
    public void deleteBillboard(Long id) {
        repository.deleteBillboard(id);
    }
}
