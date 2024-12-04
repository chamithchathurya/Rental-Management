package org.icet.crm.service.customerService;

import lombok.RequiredArgsConstructor;
import org.icet.crm.entity.CustomerEntity;
import org.icet.crm.model.Customer;
import org.icet.crm.repository.CustomerRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class CustomerServiceImpl implements CustomerService {

    final CustomerRepository repository;
    final ModelMapper modelMapper;
    @Override

    public void addCustomer(Customer customer) {
        repository.save(modelMapper.map(customer, CustomerEntity.class));

    }

    @Override
    public List<Customer> getAllCustomer() {
        List<Customer> customerList=new ArrayList<>();
        repository.findAll().forEach(customer -> customerList.add(modelMapper.map(customer,Customer.class)));
        return customerList;
    }

    @Override
    public void deleteCustomer(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public List<Customer> searchById(Integer id) {
        List<Customer>customerList=new ArrayList<>();
        repository.searchById(id).forEach(customer ->customerList.add(modelMapper.map(customer,Customer.class)));
        return customerList;
    }

    @Override
    public void editCustomer(Integer id) {
        repository.findById(id);
    }


}
