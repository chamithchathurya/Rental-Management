package org.icet.crm.service.rentalService;

import lombok.RequiredArgsConstructor;
import org.icet.crm.entity.RentalEntity;

import org.icet.crm.model.Rental;
import org.icet.crm.repository.RentalRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@RequiredArgsConstructor
public class RentalServiceImpl implements RentalService{

    final RentalRepository repository;
    final ModelMapper modelMapper;
    @Override
    public void addRental(Rental rental) {
        repository.save(modelMapper.map(rental, RentalEntity.class));

    }

    @Override
    public List<Rental> getAllRental() {
        List<Rental> rentalList=new ArrayList<>();
        repository.findAll().forEach(rental -> rentalList.add(modelMapper.map(rental,Rental.class)));
        return rentalList;
    }

    @Override
    public void deleteRental(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public List<Rental> searchById(Integer id) {
        List<Rental>rentalList=new ArrayList<>();
        repository.searchById(id).forEach(rental ->rentalList.add(modelMapper.map(rental,Rental.class)));
        return rentalList;
    }

    @Override
    public void editRental(Integer id) {
        repository.findById(id);
    }


}
