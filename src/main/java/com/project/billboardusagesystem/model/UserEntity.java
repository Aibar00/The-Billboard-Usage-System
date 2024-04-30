package com.project.billboardusagesystem.model;

import lombok.*;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name="user_entity")
@NoArgsConstructor
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;
    private String name;
    private String surname;
    private String username;
    @NonNull
    private String email;
    @NonNull
    private String password;
    private String contactInfo;
    private String role;
    @OneToMany(mappedBy = "user")
    private List<Rental> rentals;
}
