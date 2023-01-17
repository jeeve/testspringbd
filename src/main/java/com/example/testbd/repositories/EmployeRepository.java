package com.example.testbd.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.testbd.entities.Employe;

import jakarta.transaction.Transactional;

@Transactional
@Repository
public interface EmployeRepository extends JpaRepository<Employe, Long> {
}
