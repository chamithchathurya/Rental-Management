package org.icet.crm.service.rentalDetailsService;

import org.icet.crm.entity.CustomerEntity;
import org.icet.crm.model.Customer;
import org.icet.crm.model.Item;
import org.icet.crm.model.RentalDetails;

import java.util.List;

public interface RentalDetailsService {

    List<RentalDetails> getAllItem();
    void deleteItem(Integer id);
    public void addRentalDetail(RentalDetails details);


    }

