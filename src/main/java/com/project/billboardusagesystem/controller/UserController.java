package com.project.billboardusagesystem.controller;

import com.project.billboardusagesystem.model.UserEntity;
import com.project.billboardusagesystem.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/users")
@AllArgsConstructor
public class UserController {
    private final UserService service;

    @GetMapping("/{id}")
    public Optional<UserEntity> findByID(@PathVariable Long id){
        return service.findById(id);
    }

    @GetMapping
    public List<UserEntity> findAllUsers(){
        return service.findAllUser();
    }

    @PostMapping("save_user")
    public UserEntity saveUser(@RequestBody UserEntity user){
        return service.saveUser(user);
    }

    @PutMapping("update_user")
    public UserEntity updateUser(@RequestBody UserEntity user){
        return service.updateUser(user);
    }

    @DeleteMapping("delete_user/{id}")
    public void deleteUser(@PathVariable Long id){
        service.deleteUser(id);
    }
}
