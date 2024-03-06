package com.project.billboardusagesystem.repository;

import com.project.billboardusagesystem.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
