package io.github.leofalves.products.doctorsys.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.github.leofalves.products.doctorsys.model.entities.Patient;
import io.github.leofalves.products.doctorsys.model.repositories.PatientRepository;

@Service
public class PatientService {
	
	@Autowired
	private PatientRepository patientRepository;
	
	public List<Patient> findAll(){
		return patientRepository.findAll();
	}
	
	public Patient findById(Long id) {
		Optional<Patient> obj = patientRepository.findById(id);
		return obj.get();
	}
}
