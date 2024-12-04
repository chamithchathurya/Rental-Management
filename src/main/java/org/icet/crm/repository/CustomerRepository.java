package org.icet.crm.repository;

import org.icet.crm.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CustomerRepository extends JpaRepository<CustomerEntity,Integer> {
    List<CustomerEntity> searchById(Integer id);
}
