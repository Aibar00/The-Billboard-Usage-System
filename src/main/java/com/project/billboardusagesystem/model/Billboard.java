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
    private String name;
    private String location;
    private double lat;
    private double lng;
    private String status;
    private LocalDate startDate;
    private LocalDate endDate;
    private String description;
    @OneToMany(mappedBy = "billboard")
    private List<Rental> rentals;
}
