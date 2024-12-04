package org.icet.crm.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class RentalDetails {
    private Integer id;
    private Double totalItemCost;
    private Integer Quantity;
}
