package com.example.District.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class District {
    @Id
    private Long id;

    private String name;
    private String stateId;
}
