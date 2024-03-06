package com.project.billboardusagesystem.model;

import lombok.Builder;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name="role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    private int id;
    private String name;
    @OneToMany(mappedBy = "role")
    private List<UserEntity> users;
}
