package io.github.leofalves.products.doctorsys;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import io.github.leofalves.products.doctorsys.model.entities.Person;
import io.github.leofalves.products.doctorsys.model.repositories.PersonRepository;

@SpringBootApplication
public class DoctorSysApplication {

	@Bean
	public CommandLineRunner init(@Autowired PersonRepository personRep) {
		return args -> {
			Person person = new Person();
			person.setName("Leo");
			person.setDocumentNumber((long) 125);
			personRep.salvar(person);
		};
	}
	
	public static void main(String[] args) {
		SpringApplication.run(DoctorSysApplication.class, args);
	}

}
