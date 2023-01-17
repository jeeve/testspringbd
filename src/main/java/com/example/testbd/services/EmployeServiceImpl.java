package com.example.testbd.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.testbd.entities.Employe;
import com.example.testbd.repositories.EmployeRepository;

@Service
public class EmployeServiceImpl implements EmployeService {

    final private EmployeRepository employeRepository;

    public EmployeServiceImpl(EmployeRepository employeRepository) {
        this.employeRepository = employeRepository;
    }

    @Override
    public void createEmploye(Employe e) {
        this.employeRepository.save(e);   
    }

    @Override
    public List<Employe> getEmployes() {
        return this.employeRepository.findAll();
    }

    @Override
    public Employe getOneEmploye(long id) {
        return this.employeRepository.findById(id).get();
    }
    
}
