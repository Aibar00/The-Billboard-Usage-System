package com.project.billboardusagesystem.service.impl;

import com.project.billboardusagesystem.model.PricePackage;
import com.project.billboardusagesystem.repository.InMemoryPricePackageDAO;
import com.project.billboardusagesystem.service.PricePackageService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class InMemoryPricePackageServiceImpl implements PricePackageService {

    private final InMemoryPricePackageDAO repository;

    @Override
    public Optional<PricePackage> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<PricePackage> findAllPricePackage() {
        return repository.findAllPricePackage();
    }

    @Override
    public PricePackage savePricePackage(PricePackage pricePackage) {
        return repository.savePricePackages(pricePackage);
    }

    @Override
    public PricePackage updatePricePackage(PricePackage pricePackage) {
        return repository.updatePricePackage(pricePackage);
    }

    @Override
    public void deletePricePackage(Long id) {
        repository.deletePricePackage(id);
    }
}
