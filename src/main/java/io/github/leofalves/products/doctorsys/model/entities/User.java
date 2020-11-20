package io.github.leofalves.products.doctorsys.model.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Table;

import io.github.leofalves.products.doctorsys.model.entities.enums.DocumentType;

@Entity
@Table(name = "user")
public class User extends Person{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String username;
	private String password;
	
	public User() {
		super();
	}
	
	public User(Long id, String name, Long documentNumber, DocumentType documentType, LocalDate birth, String username,
			String password) {
		super(id, name, documentNumber, documentType, birth);
		this.username = username;
		this.password = password;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
