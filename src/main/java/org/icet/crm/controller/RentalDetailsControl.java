package org.icet.crm.controller;

import lombok.RequiredArgsConstructor;
import org.icet.crm.model.RentalDetails;
import org.icet.crm.service.rentalDetailsService.RentalDetailsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@CrossOrigin
public class RentalDetailsControl {
    final RentalDetailsService service;

    @GetMapping("/Get-rental-details")
    List<RentalDetails> getAllItem(){
        return service.getAllItem();
    }
    @DeleteMapping("/delete-rental-Details/{id}")
    void deleteItem(@PathVariable Integer id){
        service.deleteItem(id);
    }
    @PatchMapping("/add-rental-details")
    public void addRentalDetails(@RequestBody RentalDetails details){
        service.addRentalDetail(details);
    }
}
