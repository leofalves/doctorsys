package io.github.leofalves.products.doctorsys;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import io.github.leofalves.products.doctorsys.model.entities.Person;
import io.github.leofalves.products.doctorsys.model.entities.enums.DocumentType;
import io.github.leofalves.products.doctorsys.model.repositories.PersonRepository;

@SpringBootApplication
public class DoctorSysApplication {

	@Bean
	public CommandLineRunner init(@Autowired PersonRepository personRep) {
		return args -> {
			Person person = new Person(null, "Leo", (long) 125, DocumentType.RG, LocalDate.parse("1976-06-19"));
			personRep.salvar(person);
			
			Person person2 = new Person(null, "Elaine", (long) 155, DocumentType.CPF, LocalDate.parse("1973-03-19"));
			personRep.salvar(person2);
			
			List<Person> persons = personRep.obterTodos();
			persons.forEach(System.out::println);
		};
	}
	
	public static void main(String[] args) {
		SpringApplication.run(DoctorSysApplication.class, args);
	}

}
