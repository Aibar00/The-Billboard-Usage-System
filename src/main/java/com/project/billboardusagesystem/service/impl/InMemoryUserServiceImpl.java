package com.project.billboardusagesystem.service.impl;

import com.project.billboardusagesystem.model.UserEntity;
import com.project.billboardusagesystem.repository.InMemoryUserDAO;
import com.project.billboardusagesystem.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class InMemoryUserServiceImpl implements UserService {

    private final InMemoryUserDAO repository;
    @Override
    public Optional<UserEntity> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<UserEntity> findAllUser() {
        return repository.findAllUsers();
    }

    @Override
    public UserEntity saveUser(UserEntity user) {
        return repository.saveUser(user);
    }

    @Override
    public UserEntity updateUser(UserEntity user) {
        return repository.updateUser(user);
    }

    @Override
    public void deleteUser(Long id) {
        repository.deleteUser(id);
    }
}
