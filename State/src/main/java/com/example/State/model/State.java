package com.example.State.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class State {
    @Id
    private Long id;

    private String name;
    private String statecode;
}