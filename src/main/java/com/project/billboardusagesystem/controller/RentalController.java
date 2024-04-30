package com.project.billboardusagesystem.controller;

import com.project.billboardusagesystem.model.Rental;
import com.project.billboardusagesystem.service.RentalService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/rentals")
@AllArgsConstructor
public class RentalController {

    private final RentalService rentalService;

    @GetMapping("/{id}")
    public ResponseEntity<Rental> findById(@PathVariable Long id){
        return rentalService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/all_rental")
    public List<Rental> findAllRental(){
        return rentalService.findAllRental();
    }

    @PostMapping("save_rental")
    public Rental saveRental(@RequestBody Rental rental){
        return rentalService.saveRental(rental);
    }

    @PutMapping("update_rental")
    public Rental updateRental(@RequestBody Rental rental){
        return rentalService.updateRental(rental);
    }

    @DeleteMapping("delete_rental/{id}")
    public void deleteRental(@PathVariable Long id){
        rentalService.deleteRental(id);
    }
}
