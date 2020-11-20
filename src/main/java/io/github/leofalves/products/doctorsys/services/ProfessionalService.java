package io.github.leofalves.products.doctorsys.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.github.leofalves.products.doctorsys.model.entities.Professional;
import io.github.leofalves.products.doctorsys.model.repositories.ProfessionalRepository;

@Service
public class ProfessionalService {
	
	@Autowired
	private ProfessionalRepository professionalRepository;
	
	public List<Professional> findAll(){
		return professionalRepository.findAll();
	}
	
	public Professional findById(Long id) {
		Optional<Professional> obj = professionalRepository.findById(id);
		return obj.get();
	}
}
