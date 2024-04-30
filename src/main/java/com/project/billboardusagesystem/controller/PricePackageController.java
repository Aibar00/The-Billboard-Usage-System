package com.project.billboardusagesystem.controller;

import com.project.billboardusagesystem.model.PricePackage;
import com.project.billboardusagesystem.service.PricePackageService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/price_packages")
@AllArgsConstructor
public class PricePackageController {

    private final PricePackageService pricePackageService;

    @GetMapping("/{id}")
    public ResponseEntity<PricePackage> findById(@PathVariable Long id){
        return pricePackageService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/all_price_package")
    public List<PricePackage> findAllPricePackage(){
        return pricePackageService.findAllPricePackage();
    }

    @PostMapping("save_price_package")
    public PricePackage savePricePackage(@RequestBody PricePackage pricePackage){
        return pricePackageService.savePricePackage(pricePackage);
    }

    @PutMapping("update_price_package")
    public PricePackage updatePricePackage(@RequestBody PricePackage pricePackage){
        return pricePackageService.updatePricePackage(pricePackage);
    }

    @DeleteMapping("delete_price_package/{id}")
    public void deletePricePackage(@PathVariable Long id){
        pricePackageService.deletePricePackage(id);
    }
}
