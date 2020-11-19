package io.github.leofalves.products.doctorsys.model.repositories;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import io.github.leofalves.products.doctorsys.model.entities.Person;
import io.github.leofalves.products.doctorsys.model.entities.enums.DocumentType;

@Repository
public class PersonRepository {
	
	private static String INSERT = "insert into person (name, document_type_id, document_number, birth) values (?, ?, ?, ?) ";
	private static String SELECT_ALL = "select * from person ";
	private static String UPDATE = "update person set name = ?, document_type_id = ?, document_number = ?, birth = ? where id = ? ";
	private static String DELETE = "delete from person where id = ? ";
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public Person salvar (Person person) {	
		jdbcTemplate.update(INSERT, new Object[]{person.getName(), person.getDocumentType().getCode(), person.getDocumentNumber(), person.getBirth()});		
		return person;
	}
	
	public Person atualizar(Person person) {
		jdbcTemplate.update(UPDATE, new Object[]{person.getName(), person.getDocumentType().getCode(), person.getDocumentNumber(), person.getBirth(), person.getId()});
		return person;		
	}
	
	public void deletar (Person person) {
		jdbcTemplate.update(DELETE, new Object[] {person.getId()});
	}
	
	public void deletar (Integer id) {
		jdbcTemplate.update(DELETE, new Object[] {id});
	}
	
	public List<Person> obterTodos(){
		return jdbcTemplate.query(SELECT_ALL, getPersonMapper());
	}

	@SuppressWarnings("deprecation")
	public List<Person> obterPorNome(String name){
		return jdbcTemplate.query(SELECT_ALL.concat(" where name like ?"),
								  new Object[] {"%" + name + "%"},
								  getPersonMapper()
									);
	}

	
	private RowMapper<Person> getPersonMapper() {
		return new RowMapper<Person>() {
			
			public Person mapRow(ResultSet resultSet, int i) throws SQLException {
				return new Person(resultSet.getInt("id"), 
								  resultSet.getString("name"),
								  resultSet.getLong("document_number"),
								  DocumentType.valueOf(resultSet.getInt("document_type_id")),
								  LocalDate.parse(resultSet.getString("birth"))
								  );
			}
		};
	}

}
