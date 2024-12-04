package org.icet.crm.service.rentalDetailsService;

import lombok.RequiredArgsConstructor;
import org.icet.crm.entity.RentalDetailsEntity;
import org.icet.crm.model.Customer;
import org.icet.crm.model.Item;
import org.icet.crm.model.RentalDetails;
import org.icet.crm.repository.RentelDetailsRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class RentalDetailsServiceImpl implements RentalDetailsService {
    final ModelMapper modelMapper;
    final RentelDetailsRepository repository;
    @Override
    public List<RentalDetails> getAllItem() {
        List<RentalDetails> rentalDetails=new ArrayList<>();
        repository.findAll().forEach(rent -> rentalDetails.add(modelMapper.map(rent,RentalDetails.class)));
        return rentalDetails;
    }

    @Override
    public void deleteItem(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public void addRentalDetail(RentalDetails details) {
        repository.save(modelMapper.map(details, RentalDetailsEntity.class));
    }


}
