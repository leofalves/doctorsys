package io.github.leofalves.products.doctorsys.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.leofalves.products.doctorsys.model.entities.User;

public interface PatientRepository extends JpaRepository<User, Long>{

}
