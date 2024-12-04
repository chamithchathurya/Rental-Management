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
@Entity
@Table(name = "rental")
public class RentalEntity {
    @Id
    private Integer id;
    private String rentalDate;
    private String returnDate;
    private String dueDate;
    private Double totalCost;
    private String fine;

}
