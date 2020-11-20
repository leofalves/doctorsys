package io.github.leofalves.products.doctorsys.config;

import java.time.LocalDate;
import java.util.Arrays;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import io.github.leofalves.products.doctorsys.model.entities.Address;
import io.github.leofalves.products.doctorsys.model.entities.Patient;
import io.github.leofalves.products.doctorsys.model.entities.Person;
import io.github.leofalves.products.doctorsys.model.entities.Phone;
import io.github.leofalves.products.doctorsys.model.entities.Professional;
import io.github.leofalves.products.doctorsys.model.entities.enums.DocumentType;
import io.github.leofalves.products.doctorsys.model.repositories.PatientRepository;
import io.github.leofalves.products.doctorsys.model.repositories.PhoneRepository;
import io.github.leofalves.products.doctorsys.model.repositories.ProfessionalRepository;

@Configuration
@Profile("test")
@Transactional
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private ProfessionalRepository professionalRepository;

	@Autowired
	private PhoneRepository phoneRepository;
	
	@Autowired
	private PatientRepository patientRepository;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Saving professionals...");
		
		Person person1 = new Person(null, "Elaine Carla da Silva", 16052255545L, DocumentType.CPF, LocalDate.parse("1973-03-19"));
		Person person2 = new Person(null, "Leo Fabiano Alves", 14552255545L, DocumentType.RG, LocalDate.parse("1976-06-19"));

		Address address1 = new Address(null, 18200L, "Rua Corypheu", "Número 874", null, "Guarulhos", "SP", "BR");
		Address address2 = new Address(null, 18200L, "Rua Campos Sales", "Número 874", null, "Itapetininga", "SP", "BR");
		person1.setAddress(address1);
		person2.setAddress(address2);

		Professional prof1 = new Professional(null, "CRO","12525-5",person1);
		Professional prof2 = new Professional(null, "CPD", "1111", person2);
		
		professionalRepository.saveAll(Arrays.asList(prof1, prof2));
		

		//System.out.println("Saving patients...");
		Patient patient1 = new Patient(null, "BRADESCO", person2);
		patientRepository.save(patient1);
		
		
		Phone phone1 = new Phone(null, 55, 11, 996266629L, "CELULAR", person1);
		Phone phone2 = new Phone(null, 55, 11, 20874512L, "RESIDENCIAL", person1);
		Phone phone3 = new Phone(null, 22, 11, 999888666L, "RESIDENCIAL", person2);
		phoneRepository.saveAll(Arrays.asList(phone1, phone2, phone3));
		
		
	}

}
