package com.project.billboardusagesystem.repository;

import com.project.billboardusagesystem.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    Optional<UserEntity> findByEmail(String email);
    Optional<UserEntity> findByUsername(String username);

    boolean existsByUsername(String username);

    boolean existsByEmail(String email);
}
