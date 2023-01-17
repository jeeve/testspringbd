package com.example.testbd.services;

import java.util.List;

import com.example.testbd.entities.Employe;

public interface EmployeService {
    void createEmploye(Employe e);
    List<Employe> getEmployes();
    Employe getOneEmploye(long id);
}
