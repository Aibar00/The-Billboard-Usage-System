package com.project.billboardusagesystem.repository;

import com.project.billboardusagesystem.model.Billboard;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface BillboardRepository extends JpaRepository<Billboard, Long> {
}
