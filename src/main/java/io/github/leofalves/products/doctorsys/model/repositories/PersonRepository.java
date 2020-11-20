package io.github.leofalves.products.doctorsys.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.leofalves.products.doctorsys.model.entities.Person;

public interface PersonRepository extends JpaRepository<Person, Long>{

}
