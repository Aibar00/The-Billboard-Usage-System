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
        return Optional.ofNullable(USERS.stream()
                .filter(element -> Objects.equals(element.getId(), id))
                .findFirst()
                .orElse(null));
    }

    public List<UserEntity> findAllUsers() {
        return USERS;
    }

    public UserEntity saveUser(UserEntity user) {
        USERS.add(user);
        return user;
    }

    public UserEntity updateUser(UserEntity user) {
        var userIndex = IntStream.range(0, USERS.size())
                .filter(index -> USERS.get(index).getId() == user.getId())
                .findFirst()
                .orElse(-1);
        if(userIndex > -1) {
            USERS.set(userIndex, user);
            return user;
        }
        return null;
    }

    public void deleteUser(Long id) {
        var user = findById(id);
        if(user != null){
            USERS.remove(user);
        }
    }
}
