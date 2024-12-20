package org.icet.crm.controller;

import lombok.RequiredArgsConstructor;
import org.icet.crm.model.Customer;
import org.icet.crm.service.customerService.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequiredArgsConstructor
public class CustomerControl {

    final CustomerService service;

    @PostMapping("/add-customer")
    public void addCustomer(@RequestBody Customer customer){
        service.addCustomer(customer);

    }
    @GetMapping("/get-customers")
    public List<Customer>getAllCustomer(){
        return service.getAllCustomer();
    }
    @DeleteMapping("/delete-by-id/{id}")
    public void deleteCustomer(@PathVariable Integer id){
        service.deleteCustomer(id);
    }
    @PutMapping("/edit-by-id/{id}")
    public List<Customer> updateCustomer(@PathVariable Integer id){
        return service.editCustomer(id);
    }
    @GetMapping("/search-by-id/{id}")
    public List<Customer> searchById(@PathVariable Integer id){
        return service.searchById(id);
    }

}
