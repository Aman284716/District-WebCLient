package com.example.State.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class District {
    private Long id;
    private String name;
    private String stateId;
}
