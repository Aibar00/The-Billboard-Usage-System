package com.project.billboardusagesystem.service.impl;

import com.project.billboardusagesystem.model.Rental;
import com.project.billboardusagesystem.repository.RentalRepository;
import com.project.billboardusagesystem.service.RentalService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Primary
@AllArgsConstructor
public class RentalServiceImpl implements RentalService {

    private final RentalRepository rentalRepository;

    @Override
    public Optional<Rental> findById(Long id) {
        return rentalRepository.findById(id);
    }

    @Override
    public List<Rental> findAllRental() {
        return rentalRepository.findAll();
    }

    @Override
    public Rental saveRental(Rental rental) {
        return rentalRepository.save(rental);
    }

    @Override
    public Rental updateRental(Rental rental) {
        return rentalRepository.save(rental);
    }

    @Override
    public void deleteRental(Long id) {
        rentalRepository.deleteById(id);
    }
}
