package com.example.testbd.entities;

import java.util.ArrayList;
import java.util.Collection;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Departement {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;   
    private String departementName;
    @OneToMany(mappedBy = "departement")
    Collection<Employe> employes = new ArrayList<>();
}