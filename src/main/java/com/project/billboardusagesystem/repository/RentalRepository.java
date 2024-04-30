package com.project.billboardusagesystem.repository;

import com.project.billboardusagesystem.model.Rental;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RentalRepository extends JpaRepository<Rental, Long> {
}
