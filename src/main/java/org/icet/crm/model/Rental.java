package org.icet.crm.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Rental {
    private Integer id;
    private String rentalDate;
    private String returnDate;
    private String dueDate;
    private Double totalCost;
    private String fine;

}
