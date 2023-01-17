package com.example.testbd.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeModel {
    private String employeName;
    private float age;
    private long departementId;
}
