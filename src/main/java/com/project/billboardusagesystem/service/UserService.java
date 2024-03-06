package com.project.billboardusagesystem.service;

import com.project.billboardusagesystem.model.UserEntity;

import java.util.List;
import java.util.Optional;

public interface UserService {
    Optional<UserEntity> findById(Long id);
    List<UserEntity> findAllUser();
    UserEntity saveUser(UserEntity user);
    UserEntity updateUser(UserEntity user);
    void deleteUser(Long id);
}
