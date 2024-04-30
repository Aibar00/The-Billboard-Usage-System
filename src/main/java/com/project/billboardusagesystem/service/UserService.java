package com.project.billboardusagesystem.service;

import com.project.billboardusagesystem.model.UserEntity;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;
import java.util.Optional;

public interface UserService extends UserDetailsService {
    Optional<UserEntity> findById(Long id);
    Optional<UserEntity> findByEmail(String email);
    List<UserEntity> findAllUser();
    UserEntity saveUser(UserEntity user);
    UserEntity updateUser(UserEntity user);
    void deleteUser(Long id);
}
