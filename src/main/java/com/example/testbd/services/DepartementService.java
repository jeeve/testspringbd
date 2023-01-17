package com.example.testbd.services;

import java.util.List;

import com.example.testbd.entities.Departement;

public interface DepartementService {
    void createDepartement(Departement d);
    List<Departement> findDepartements();
    Departement findOneDepartement(long id);   
}
