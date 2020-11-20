package io.github.leofalves.products.doctorsys.config;

import java.time.LocalDate;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import io.github.leofalves.products.doctorsys.model.entities.Address;
import io.github.leofalves.products.doctorsys.model.entities.Phone;
import io.github.leofalves.products.doctorsys.model.entities.Professional;
import io.github.leofalves.products.doctorsys.model.entities.enums.DocumentType;
import io.github.leofalves.products.doctorsys.model.repositories.PhoneRepository;
import io.github.leofalves.products.doctorsys.model.repositories.ProfessionalRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private ProfessionalRepository professionalRepository;

	@Autowired
	private PhoneRepository phoneRepository;

	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Saving professionals...");
		Professional p1 = new Professional(null, "Elaine Carla da Silva", 16052255545L, DocumentType.CPF, LocalDate.parse("1973-03-19"), "CRO", "1225-2");
		Address address1 = new Address(null, 18200L, "Rua Corypheu", "Número 874", null, "Guarulhos", "SP", "BR");
		p1.setAddress(address1);
		
		Professional p2 = new Professional(null, "Leo Fabiano Alves", 14552255545L, DocumentType.RG, LocalDate.parse("1976-06-19"), "CPD", "1111");
		Address address2 = new Address(null, 18200L, "Rua Campos Sales", "Número 874", null, "Itapetininga", "SP", "BR");
		p2.setAddress(address2);
		
		Phone phone1 = new Phone(null, 55, 11, 996266629L, "CELULAR", p1);
		Phone phone2 = new Phone(null, 55, 11, 20874512L, "RESIDENCIAL", p1);

		professionalRepository.saveAll(Arrays.asList(p1, p2));
		phoneRepository.saveAll(Arrays.asList(phone1, phone2));
		
	}

}
