package org.icet.crm.service.itemService;


import org.icet.crm.model.Item;

import java.util.List;

public interface ItemService {
    void addItem(Item item);
    List<Item>getAllItem();
    void deleteItem(Integer id);
    List<Item>searchById(Integer id);
    List<Item> editItem(Integer id);
}
