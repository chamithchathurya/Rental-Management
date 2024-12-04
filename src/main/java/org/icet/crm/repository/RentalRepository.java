package org.icet.crm.repository;

import org.icet.crm.entity.RentalEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RentalRepository  extends JpaRepository<RentalEntity,Integer> {
    List<RentalEntity> searchById(Integer id);
}
