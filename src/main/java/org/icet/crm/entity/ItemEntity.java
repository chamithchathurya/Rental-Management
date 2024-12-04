package org.icet.crm.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

@Entity
public class ItemEntity {
    @Id
    private Integer id;
    private String name;
    private String rentalPreDay;
    private String finePerDay;
    private boolean availability;
    
}
