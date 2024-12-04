package org.icet.crm.service.itemService;

import lombok.RequiredArgsConstructor;
import org.icet.crm.entity.ItemEntity;
import org.icet.crm.model.Customer;
import org.icet.crm.model.Item;
import org.icet.crm.repository.ItemRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@RequiredArgsConstructor
@Service
public class ItemServiceImpl implements ItemService{
    final ItemRepository repository;
    final ModelMapper modelMapper;
    @Override
    public void addItem(Item item) {
        repository.save(modelMapper.map(item, ItemEntity.class));
    }

    @Override
    public List<Item> getAllItem() {
        List<Item> itemList=new ArrayList<>();
        repository.findAll().forEach(item -> itemList.add(modelMapper.map(item,Item.class)));
        return itemList;
    }

    @Override
    public void deleteItem(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public List<Item> searchById(Integer id) {
        List<Item>itemList=new ArrayList<>();
        repository.searchById(id).forEach(item ->itemList.add(modelMapper.map(item,Item.class)));
        return itemList;
    }

    @Override
    public List<Item> editItem(Integer id) {
        List<Item>itemList=new ArrayList<>();
        repository.searchById(id).forEach(item ->itemList.add(modelMapper.map(item,Item.class)));
        return itemList;
    }
}



