package com.project.billboardusagesystem.service.impl;

import com.project.billboardusagesystem.model.Rental;
import com.project.billboardusagesystem.repository.InMemoryRentalDAO;
import com.project.billboardusagesystem.service.RentalService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class InMemoryRentalServiceImpl implements RentalService {

    private final InMemoryRentalDAO repository;

    @Override
    public Optional<Rental> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<Rental> findAllRental() {
        return null;
    }

    @Override
    public Rental saveRental(Rental rental) {
        return null;
    }

    @Override
    public Rental updateRental(Rental rental) {
        return null;
    }

    @Override
    public void deleteRental(Long id) {

    }
}
