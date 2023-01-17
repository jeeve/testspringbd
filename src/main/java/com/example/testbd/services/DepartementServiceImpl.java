package com.example.testbd.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.testbd.entities.Departement;
import com.example.testbd.repositories.DepartementRepository;

@Service
public class DepartementServiceImpl implements DepartementService {

    final DepartementRepository departementRepository;

    public DepartementServiceImpl(DepartementRepository departementRepository) {
        this.departementRepository = departementRepository;
    }

    @Override
    public void createDepartement(Departement d) {
        this.departementRepository.save(d);
    }

    @Override
    public List<Departement> findDepartements() {
        return this.departementRepository.findAll();
    }

    @Override
    public Departement findOneDepartement(long id) {
        return this.departementRepository.findById(id).get();
    }
    
}
