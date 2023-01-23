package com.example.testbd.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.testbd.entities.Employe;
import com.example.testbd.models.EmployeModel;
import com.example.testbd.services.DepartementService;
import com.example.testbd.services.EmployeService;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping(value = "/api")
public class EmployeRestController {

    @Autowired
    private EmployeService employeService;

    @Autowired
    private DepartementService departementService;

    @PostMapping("/employes")
    void createEmploye(@RequestBody EmployeModel model) {
        Employe employe = new Employe();
        employe.setEmployeName(model.getEmployeName());
        employe.setAge(model.getAge());
        employe.setDepartement(this.departementService.findOneDepartement(model.getDepartementId()));
        this.employeService.createEmploye(employe);
    }

    @GetMapping("/employes")
    List<Employe> Employes() {
        return this.employeService.getEmployes();
    }

    @GetMapping("/employes/{id}")
    Employe getOneEmploye(@PathVariable long id) {
        return this.employeService.getOneEmploye(id);
    }
    
}
