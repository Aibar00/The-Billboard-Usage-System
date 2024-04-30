package com.project.billboardusagesystem.service;

import com.project.billboardusagesystem.model.PricePackage;

import java.util.List;
import java.util.Optional;

public interface PricePackageService {
    Optional<PricePackage> findById(Long id);
    List<PricePackage> findAllPricePackage();
    PricePackage savePricePackage(PricePackage pricePackage);
    PricePackage updatePricePackage(PricePackage pricePackage);
    void deletePricePackage(Long id);
}
