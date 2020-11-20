package io.github.leofalves.products.doctorsys.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.leofalves.products.doctorsys.model.entities.Patient;
import io.github.leofalves.products.doctorsys.services.PatientService;

@RestController
@RequestMapping(value = "/patients")
public class PatientResource {
	
	@Autowired
	private PatientService patientService;
	
	@GetMapping
	public ResponseEntity<List<Patient>> findAll() {
		List<Patient> list = patientService.findAll();
		return ResponseEntity.ok(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Patient> findById(@PathVariable Long id){
		Patient obj = patientService.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
