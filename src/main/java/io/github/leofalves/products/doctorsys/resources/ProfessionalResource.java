package io.github.leofalves.products.doctorsys.resources;

import java.time.LocalDate;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.leofalves.products.doctorsys.model.entities.Person;
import io.github.leofalves.products.doctorsys.model.entities.enums.DocumentType;

@RestController
@RequestMapping(value = "/professionals")
public class ProfessionalResource {
	
	@GetMapping
	public ResponseEntity<Person> findAll(){
		Person p = new Person(1, "Fabiano", 2344L, DocumentType.RG, LocalDate.now());
		return ResponseEntity.ok(p);
	}
}
