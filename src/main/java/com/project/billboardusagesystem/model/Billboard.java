package com.project.billboardusagesystem.model;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
@Data
@Builder
public class Billboard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int billboardId;
    private String location;
    private String status;
    private LocalDate endDate;
}
