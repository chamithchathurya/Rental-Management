package org.icet.crm.controller;

import lombok.RequiredArgsConstructor;
import org.icet.crm.model.Rental;
import org.icet.crm.service.rentalService.RentalService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequiredArgsConstructor
public class RentalControl {
    final RentalService service;

    @PostMapping("/add-rental")
    public void addRental(@RequestBody Rental rental){
        service.addRental(rental);

    }
    @GetMapping("/get-rental")
    public List<Rental> getAllRental(){
        return service.getAllRental();
    }
    @DeleteMapping("/delete-rental/{id}")
    public void deleteRental(@PathVariable Integer id){
        service.deleteRental(id);
    }
    @PatchMapping("/edit-rental/{id}")
    public void updateRental(@PathVariable Integer id){
        service.editRental(id);
    }
    @GetMapping("/search-rental/{id}")
    public List<Rental> searchById(@PathVariable Integer id){
        return service.searchById(id);
    }
}
