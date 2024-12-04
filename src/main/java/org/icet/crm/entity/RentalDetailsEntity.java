package org.icet.crm.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

@Table(name="rentalDeatails")
@Entity
public class RentalDetailsEntity {
    @Id
    private Integer Id;
    private Double totalItemCost;
    private Integer Quantity;
}
