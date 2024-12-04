package org.icet.crm.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Item {
    private Integer id;
    private String name;
    private String rentalPreDay;
    private String finePerDay;
    private boolean availability;
    
}
