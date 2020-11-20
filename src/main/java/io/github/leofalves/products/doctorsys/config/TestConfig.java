package io.github.leofalves.products.doctorsys.config;

import java.time.LocalDate;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import io.github.leofalves.products.doctorsys.model.entities.Professional;
import io.github.leofalves.products.doctorsys.model.entities.enums.DocumentType;
import io.github.leofalves.products.doctorsys.model.repositories.ProfessionalRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private ProfessionalRepository professionalRepository;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Saving professionals...");
		Professional p1 = new Professional(null, "Elaine Carla da Silva", 16052255545L, DocumentType.CPF, LocalDate.parse("1973-03-19"), "CRO", "1225-2");
		Professional p2 = new Professional(null, "Leo Fabiano Alves", 14552255545L, DocumentType.CPF, LocalDate.parse("1976-06-19"), "CPD", "1111");
			
		professionalRepository.saveAll(Arrays.asList(p1, p2));
		
	}

}
