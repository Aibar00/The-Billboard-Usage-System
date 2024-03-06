package com.project.billboardusagesystem.model;

import lombok.*;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name="user")
@NoArgsConstructor
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;
    private String name;
    private String surname;
    @NonNull
    private String username;
    @NonNull
    private String password;
    private String contactInfo;
    @OneToMany(mappedBy = "user")
    private List<Rental> rentals;
    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;
}
