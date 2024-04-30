package com.project.billboardusagesystem.repository;

import com.project.billboardusagesystem.model.Rental;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;

@Repository
public class InMemoryRentalDAO {

    List<Rental> RENTALS = new ArrayList<>();

    public Optional<Rental> findById(Long id){
        return RENTALS.stream()
                .filter(rental -> Objects.equals(rental.getId(), id))
                .findFirst();
    }

    public List<Rental> findAllRental(){
        return RENTALS;
    }

    public Rental saveRental(Rental rental){
        RENTALS.add(rental);
        return rental;
    }

    public Rental updateRental(Rental rental){
        var rentalIndex = IntStream.range(0, RENTALS.size())
                .filter(index -> Objects.equals(RENTALS.get(index).getId(), rental.getId()))
                .findFirst()
                .orElse(-1);
        if(rentalIndex > -1){
            RENTALS.set(rentalIndex, rental);
            return rental;
        }
        return null;
    }

    public void deleteRental(Long id){
        findById(id).ifPresent(RENTALS::remove);
    }
}
