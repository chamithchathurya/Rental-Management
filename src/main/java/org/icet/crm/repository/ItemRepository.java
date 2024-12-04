package org.icet.crm.repository;

import org.icet.crm.entity.ItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ItemRepository extends JpaRepository<ItemEntity,Integer> {
    List<ItemEntity> searchById(Integer id);
}
