package io.github.leofalves.products.doctorsys.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.leofalves.products.doctorsys.model.entities.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long>{

}
