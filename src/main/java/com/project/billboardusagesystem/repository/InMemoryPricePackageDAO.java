package com.project.billboardusagesystem.repository;

import com.project.billboardusagesystem.model.PricePackage;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;

@Repository
public class InMemoryPricePackageDAO {

    private final List<PricePackage> PRICEPACKAGES = new ArrayList<>();

    public Optional<PricePackage> findById(Long id){
        return PRICEPACKAGES.stream()
                .filter(pricePackage -> Objects.equals(pricePackage.getId(), id))
                .findFirst();
    }

    public List<PricePackage> findAllPricePackage(){
        return PRICEPACKAGES;
    }

    public PricePackage savePricePackages(PricePackage pricePackage){
        PRICEPACKAGES.add(pricePackage);
        return pricePackage;
    }

    public PricePackage updatePricePackage(PricePackage pricePackage){
        var pricePackageIndex = IntStream.range(0, PRICEPACKAGES.size())
                .filter(index -> Objects.equals(PRICEPACKAGES.get(index).getId(), pricePackage.getId()))
                .findFirst()
                .orElse(-1);
        if(pricePackageIndex > -1){
            PRICEPACKAGES.set(pricePackageIndex, pricePackage);
            return pricePackage;
        }
        return null;
    }

    public void deletePricePackage(Long id){
        findById(id).ifPresent(PRICEPACKAGES::remove);
    }
}
