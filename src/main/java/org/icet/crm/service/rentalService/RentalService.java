package org.icet.crm.service.rentalService;


import org.icet.crm.model.Rental;

import java.util.List;

public interface RentalService {
    void addRental(Rental rental);
    List<Rental> getAllRental();
    void deleteRental(Integer id);
    List<Rental>searchById(Integer id);
    void editRental(Integer id);
}
