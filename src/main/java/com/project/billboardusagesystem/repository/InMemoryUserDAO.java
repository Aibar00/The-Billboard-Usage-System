package com.project.billboardusagesystem.repository;

import com.project.billboardusagesystem.model.Billboard;
import com.project.billboardusagesystem.model.UserEntity;
import org.apache.catalina.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;

@Repository
public class InMemoryUserDAO {
    private final List<UserEntity> USERS = new ArrayList<>();

    public Optional<UserEntity> findById(Long id) {
        return USERS.stream()
                .filter(user -> Objects.equals(user.getId(), id))
                .findFirst();
    }

    public Optional<UserEntity> findByEmail(String email) {
        return USERS.stream()
                .filter(user -> Objects.equals(user.getEmail(), email))
                .findFirst();
    }

    public List<UserEntity> findAllUser() {
        return USERS;
    }

    public UserEntity saveUser(UserEntity user) {
        USERS.add(user);
        return user;
    }

    public UserEntity updateUser(UserEntity user) {
        var userIndex = IntStream.range(0, USERS.size())
                .filter(index -> Objects.equals(USERS.get(index).getId(), user.getId()))
                .findFirst()
                .orElse(-1);
        if(userIndex > -1) {
            USERS.set(userIndex, user);
            return user;
        }
        return null;
    }

    public void deleteUser(Long id) {
        findById(id).ifPresent(USERS::remove);
    }
}
