package org.icet.crm.service.customerService;

import org.icet.crm.model.Customer;

import java.util.List;

public interface CustomerService {
    void addCustomer(Customer customer);
    List<Customer>getAllCustomer();
    void deleteCustomer(Integer id);
    List<Customer>searchById(Integer id);
    void editCustomer(Integer id);
}
