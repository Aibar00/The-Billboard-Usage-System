package com.project.billboardusagesystem.service;

import com.project.billboardusagesystem.model.Rental;

import java.util.List;
import java.util.Optional;

public interface RentalService {
    Optional<Rental> findById(Long id);
    List<Rental> findAllRental();
    Rental saveRental(Rental rental);
    Rental updateRental(Rental rental);
    void deleteRental(Long id);
}
