package io.github.leofalves.products.doctorsys.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.leofalves.products.doctorsys.model.entities.Professional;
import io.github.leofalves.products.doctorsys.services.ProfessionalService;

@RestController
@RequestMapping(value = "/professionals")
public class ProfessionalResource {
	
	@Autowired
	private ProfessionalService professionalService;
	
	@GetMapping
	public ResponseEntity<List<Professional>> findAll() {
		List<Professional> list = professionalService.findAll();
		return ResponseEntity.ok(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Professional> findById(@PathVariable Long id){
		Professional obj = professionalService.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
