package com.project.billboardusagesystem.service.impl;

import com.project.billboardusagesystem.model.Billboard;
import com.project.billboardusagesystem.repository.BillboardRepository;
import com.project.billboardusagesystem.service.BillboardService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Primary
@AllArgsConstructor
public class BillboardServiceImpl implements BillboardService {

    private final BillboardRepository billboardRepository;

    @Override
    public Optional<Billboard> findById(Long id) {
        return billboardRepository.findById(id);
    }

    @Override
    public List<Billboard> findAllBillboard() {
        return billboardRepository.findAll();
    }

    @Override
    public Billboard saveBillboard(Billboard billboard) {
        return billboardRepository.save(billboard);
    }

    @Override
    public Billboard updateBillboard(Billboard billboard) {
        return billboardRepository.save(billboard);
    }

    @Override
    public void deleteBillboard(Long id) {
        billboardRepository.deleteById(id);
    }
}
