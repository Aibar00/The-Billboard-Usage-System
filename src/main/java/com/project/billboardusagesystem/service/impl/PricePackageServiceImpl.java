package com.project.billboardusagesystem.service.impl;

import com.project.billboardusagesystem.model.PricePackage;
import com.project.billboardusagesystem.repository.PricePackageRepository;
import com.project.billboardusagesystem.service.PricePackageService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Primary
@AllArgsConstructor
public class PricePackageServiceImpl implements PricePackageService {

    private final PricePackageRepository pricePackageRepository;

    @Override
    public Optional<PricePackage> findById(Long id) {
        return pricePackageRepository.findById(id);
    }

    @Override
    public List<PricePackage> findAllPricePackage() {
        return pricePackageRepository.findAll();
    }

    @Override
    public PricePackage savePricePackage(PricePackage pricePackage) {
        return pricePackageRepository.save(pricePackage);
    }

    @Override
    public PricePackage updatePricePackage(PricePackage pricePackage) {
        return pricePackageRepository.save(pricePackage);
    }

    @Override
    public void deletePricePackage(Long id) {
        pricePackageRepository.deleteById(id);
    }
}
