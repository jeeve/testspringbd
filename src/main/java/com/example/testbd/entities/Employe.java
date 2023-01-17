package com.example.testbd.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employe {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;   
    private String employeName;
    private float age;
    @ManyToOne
    Departement departement;
}
