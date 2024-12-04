package org.icet.crm.repository;

import org.icet.crm.entity.RentalDetailsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface RentelDetailsRepository extends JpaRepository<RentalDetailsEntity,Integer> {
}
