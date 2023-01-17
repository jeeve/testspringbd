package com.example.testbd.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.testbd.entities.Departement;
import com.example.testbd.models.DepartementModel;
import com.example.testbd.services.DepartementService;

@RestController
@RequestMapping(value = "/api")
public class DepartementRestController {
    @Autowired
    DepartementService departementService;

    @PostMapping("/departements")
    void createDepartement(@RequestBody DepartementModel model) {
        Departement departement = new Departement();
        departement.setDepartementName(model.getDepartementName());
        this.departementService.createDepartement(departement);
    }

    @GetMapping("/departements")
    List<Departement> Departements() {
        return this.departementService.findDepartements();
    }

    @GetMapping("/departements/{id}")
    Departement getOneDepartement(@PathVariable long id) {
        return this.departementService.findOneDepartement(id);
    }
}
