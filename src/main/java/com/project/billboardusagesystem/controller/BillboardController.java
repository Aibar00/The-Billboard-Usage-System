package com.project.billboardusagesystem.controller;

import com.project.billboardusagesystem.model.Billboard;
import com.project.billboardusagesystem.service.BillboardService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/v1/billboards")
@AllArgsConstructor
public class BillboardController {

    private final BillboardService billboardService;

    @GetMapping("/{id}")
    public ResponseEntity<Billboard> findById(@PathVariable Long id) {
        return billboardService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/all_billboard")
    public List<Billboard> findAllBillboards() {
        return billboardService.findAllBillboard();
    }

    @PostMapping("save_billboard")
    public Billboard saveBillboard(@RequestBody Billboard billboard){
        return billboardService.saveBillboard(billboard);
    }

    @PutMapping("update_billboard")
    public Billboard updateBillboard(@RequestBody Billboard billboard){
        return billboardService.updateBillboard(billboard);
    }

    @DeleteMapping("delete_billboard/{id}")
    public void deleteBillboard(@PathVariable Long id){
        billboardService.deleteBillboard(id);
    }
}
