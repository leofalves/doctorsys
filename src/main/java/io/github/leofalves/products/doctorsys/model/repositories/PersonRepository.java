package io.github.leofalves.products.doctorsys.model.repositories;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import io.github.leofalves.products.doctorsys.model.entities.Person;

@Repository
public class PersonRepository {
	
	@Autowired
	private EntityManager entityManager;
	
	@Transactional
	public Person salvar (Person person) {	
		entityManager.persist(person);		
		return person;
	}
	
	@Transactional
	public Person atualizar(Person person) {
		entityManager.merge(person);
		return person;		
	}
	
	@Transactional
	public void deletar (Person person) {
		entityManager.remove(person);
	}
	
	@Transactional
	public void deletar (Integer id) {
		Person person = entityManager.find(Person.class, id);
		entityManager.remove(person);
	}
	
	@Transactional(readOnly = true)
	public List<Person> obterTodos(){
		return entityManager.createQuery("from Person", Person.class).getResultList();
	}

	@Transactional(readOnly = true)
	public List<Person> obterPorNome(String name){
		String jpql = "select p from person p where p.name like :name ";
		TypedQuery<Person> query = entityManager.createQuery(jpql, Person.class);
		query.setParameter("name", "%"+ name +"%");
		return query.getResultList();
	}
}
