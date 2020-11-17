package io.github.leofalves.products.doctorsys.model.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import io.github.leofalves.products.doctorsys.model.entities.Person;

@Repository
public class PersonRepository {
	
	private static String INSERT = "insert into person (name, document_number) values (?, ?) ";
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public Person salvar (Person person) {
		
		jdbcTemplate.update(INSERT, new Object[]{person.getName(), person.getDocumentNumber()});		
		return person;
	}

}
