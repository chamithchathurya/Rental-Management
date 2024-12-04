package org.icet.crm.controller;

import lombok.RequiredArgsConstructor;
import org.icet.crm.model.Item;
import org.icet.crm.service.itemService.ItemService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequiredArgsConstructor
public class ItemControl {
    final ItemService service;
   @PostMapping("/add-item")
    void addItem(@RequestBody Item item){
        service.addItem(item);
    }
    @GetMapping("/get-items")
    List<Item> getAllItem(){
        return service.getAllItem();
    }
    @DeleteMapping("delete-item/{id}")
    void deleteItem(@PathVariable Integer id){
        service.editItem(id);
    }
    @GetMapping("/search-item/{id}")
    List<Item>searchById(@PathVariable Integer id){
        return service.searchById(id);
    }
    @PatchMapping("/edit-item/{id}")
    List<Item> editItem(@PathVariable Integer id){
        return service.editItem(id);
    }
}
