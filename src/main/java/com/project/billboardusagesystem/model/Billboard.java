package com.project.billboardusagesystem.model;
import lombok.Builder;
import lombok.Data;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@Table(name = "billboard")
public class Billboard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "billboard_id")
    private Long id;
    private String location;
    private String status;
    private LocalDate endDate;
    @OneToMany(mappedBy = "billboard")
    private List<Rental> rentals;
}
