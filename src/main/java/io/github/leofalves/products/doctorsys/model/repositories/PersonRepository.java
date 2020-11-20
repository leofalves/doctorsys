package io.github.leofalves.products.doctorsys.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import io.github.leofalves.products.doctorsys.model.entities.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long>{
	
}
