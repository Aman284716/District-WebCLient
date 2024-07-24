package com.example.State.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Response {
    private String name;
    private String statecode;
    private List<District> districts;
}
