package com.project.billboardusagesystem.service.impl;

import com.project.billboardusagesystem.model.UserEntity;
import com.project.billboardusagesystem.repository.UserRepository;
import com.project.billboardusagesystem.security.UserDetailsImpl;
import com.project.billboardusagesystem.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@Primary
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository repository;

    @Override
    public Optional<UserEntity> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Optional<UserEntity> findByEmail(String email){
        return repository.findByEmail(email);
    }

    @Override
    public List<UserEntity> findAllUser() {
        return repository.findAll();
    }

    @Override
    public UserEntity saveUser(UserEntity user) {
        return repository.save(user);
    }

    @Override
    public UserEntity updateUser(UserEntity user) {
        return repository.save(user);
    }

    @Override
    public void deleteUser(Long id) {
        repository.deleteById(id);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity user = repository.findByUsername(username).orElseThrow(() -> new UsernameNotFoundException(
                String.format("User '%s' not found", username)
        ));
        return UserDetailsImpl.build(user);
    }
}
